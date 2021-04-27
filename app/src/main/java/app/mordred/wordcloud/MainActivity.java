package app.mordred.wordcloud;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.widget.ImageView;

import com.mordred.wordcloud.WordCloud;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgView = findViewById(R.id.imageView);

        Map<String, Pair<Integer, Integer>> nMap = new HashMap<>();
        nMap.put("oguzhan", Pair.create(2 , Color.BLACK));
        nMap.put("is", Pair.create(2 , Color.WHITE));
        nMap.put("on", Pair.create(2 , Color.RED));
        nMap.put("the", Pair.create(2 , Color.GREEN));

        WordCloud wd = new WordCloud(nMap, 250, 250,Color.WHITE);
        wd.setWordColorOpacityAuto(true);
        wd.setPaddingX(5);
        wd.setPaddingY(5);

        Bitmap generatedWordCloudBmp = wd.generate();

        imgView.setImageBitmap(generatedWordCloudBmp);

    }
}
