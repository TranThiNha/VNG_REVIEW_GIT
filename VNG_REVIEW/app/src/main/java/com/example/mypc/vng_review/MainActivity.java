package com.example.mypc.vng_review;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mypc.vng_review.SugarDao.Book;
import com.example.mypc.vng_review.greenDao.DaoSession;
import com.example.mypc.vng_review.retrofit.api.MovieApi;
import com.example.mypc.vng_review.retrofit.model.NowPlaying;
import com.example.mypc.vng_review.retrofit.utils.Constant;
import com.example.mypc.vng_review.retrofit.utils.RetrofitUtils;
import com.example.mypc.vng_review.test_dagger2.MyApplication;
import com.example.mypc.vng_review.test_dagger2.models.Cat;
import com.example.mypc.vng_review.test_dagger2.models.Dog;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.IOException;
import java.io.InputStream;

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity implements ViewLisstener {

    Presenter presenter;
    ImageView img;
    Button btn;
    OkHttpClient client = new OkHttpClient();
    private MovieApi mMovieApi;

    @Inject Cat cat;
    @Inject
    Dog dog;

    DaoSession daoSession;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(this);
        img = (ImageView) findViewById(R.id.img);
        btn = (Button) findViewById(R.id.btn);

        ((MyApplication)getApplication()).getAppComponent().inject(this);
        cat.keu();
        dog.keu();

//dagger 2


        //retrofit
        mMovieApi = RetrofitUtils.get(Constant.API_KEY).create(MovieApi.class);
        //fetchMovies();


        //Reactive X
//        rx.Observable<String> observable = rx.Observable.just("");
//        Observer<String> observer = new Observer<String>() {
//            @Override
//            public void onCompleted() {
//                Log.d("MY OBSERVER", "zo");
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onNext(String s) {
//                Log.d("MY OBSERVER", s);
//            }
//        };
//
//        Subscription subscription = observable.subscribe(observer);

//        rx.Observable<String> arrayObservable = rx.Observable.from(new String[]{"nha","tam","nhi"});
//
//        //Subscription subscription1 = arrayObservable.subscribe(observer);
//
//        arrayObservable.subscribe(new Action1<String>() {
//            @Override
//            public void call(String s) {
//                Log.d("My Action",s);
//            }
//        });
//
//        rx.Observable<String> arrayObservable1 = arrayObservable.map(new Func1<String, String>() {
//            @Override
//            public String call(String s) {
//                return s + " hehe";
//            }
//        });
//
//        arrayObservable1.subscribe(new Action1<String>() {
//            @Override
//            public void call(String s) {
//                Log.d("My Action",s);
//            }
//        });
//
//        rx.Observable<String> fetchFromGoogle = rx.Observable.create(new rx.Observable.OnSubscribe<String>() {
//            @Override
//            public void call(Subscriber<? super String> subscriber) {
//                try {
//                    String data = "nhaaaaaaaa";
//                    subscriber.onNext(data);
//                    subscriber.onCompleted();
//                }catch (Exception e){
//                    subscriber.onError(e);
//                }
//            }
//        });
//
//        fetchFromGoogle.subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<String>() {
//            @Override
//            public void call(String s) {
//                btn.setText(s);
//            }
//        });
//
//        rx.Observable<OnClickEvent> clickEventObservable = ViewObservable.clicks(btn);
//        clickEventObservable.skip(2).subscribe(new Action1<OnClickEvent>() {
//            @Override
//            public void call(OnClickEvent onClickEvent) {
//                Log.d("CLICK","CLICKED!");
//            }
//        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //new download().execute();


                //MessageEvent event = new MessageEvent("tran thi nha");
                //EventBus.getDefault().post(event);

                Book book = Book.findById(Book.class, 1);
                Toast.makeText(getApplicationContext(),book.getTitle(),Toast.LENGTH_SHORT).show();
                book.setTitle("NHA TRAN KAKA");
                book.save();
            }

        });

        //daoSession = ((DemoAPP)getApplication()).getmDaoSession();

        //GREEN DAO
//        user = daoSession.getUserDao().load(1L);
//
//        user.setName("NHA HIHI");
//        daoSession.getUserDao().update(user);
//        if (user != null){
//            Toast.makeText(getApplicationContext(),user.getName(),Toast.LENGTH_SHORT).show();
//            Log.d("in",user.getName());
//        }
//        Student student = daoSession.getStudentDao().load(2L);
//        if (student != null){
//            Toast.makeText(getApplicationContext(),student.getName(),Toast.LENGTH_SHORT).show();
//            student.setName("TAM KHUNG");
//            daoSession.getStudentDao().update(student);
//        }


        //SugarDao
//        Book book = new Book("Title here", "2nd edition");
//        book.save();




    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent event){
        Log.d("NHA","LISTEN");
        Toast.makeText(getApplicationContext(), event.message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    void fetchMovies(){
        mMovieApi.getNowPlaying().enqueue(new Callback<NowPlaying>() {
            @Override
            public void onResponse(Call<NowPlaying> call, retrofit2.Response<NowPlaying> response) {
                for (int i = 0 ; i < response.body().getMovies().size() ;i++){
                    Log.d("movie "+ i,response.body().getMovies().get(i).getTitle());
                }
            }

            @Override
            public void onFailure(Call<NowPlaying> call, Throwable t) {

            }
        });
    }


    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void onClicked(Bitmap respond) {
        //new loadImage().execute(respond);
        //img.setImageBitmap(respond);
    }

    class loadImage extends AsyncTask<Bitmap, Void,Void> {

        @Override
        protected Void doInBackground(Bitmap... bitmaps) {
            Bitmap bitmap = bitmaps[0];

            return null;
        }
    }

    class download extends AsyncTask<Void,Void,Bitmap>{

        @Override
        protected Bitmap doInBackground(Void... voids) {
            try {
                Bitmap result = run("https://s7d2.scene7.com/is/image/PetSmart/PB1201_STORY_CARO-Authority-HealthyOutside-DOG-20160818?$PB1201$");
                return result;
            } catch (IOException e) {
                e.printStackTrace();
            }


            return null;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            img.setImageBitmap(bitmap);
        }
    }

    Bitmap run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        InputStream stream =  response.body().byteStream();
        Bitmap bitmap = BitmapFactory.decodeStream(stream);
        return bitmap;

    }
}
