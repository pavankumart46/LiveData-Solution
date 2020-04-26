package youtube.com.vidhvan.databinding_viewmodel_livedata_starter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import youtube.com.vidhvan.databinding_viewmodel_livedata_starter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainViewModel mainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        binding.setLifecycleOwner(this);
        binding.setMyvar(mainViewModel);

        Log.i("MainActivity","MainViewModel is Initialized!");

       /* mainViewModel.score.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                binding.score.setText(String.valueOf(mainViewModel.score.getValue()));
            }
        });

        binding.plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainViewModel.increment();
            }
        });

        binding.minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainViewModel.decrement();
            }
        });*/
    }
}
