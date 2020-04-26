package youtube.com.vidhvan.databinding_viewmodel_livedata_starter;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel
{
    public MutableLiveData<Integer> score = new MutableLiveData<>();
    public MainViewModel()
    {
        score.setValue(0);
        Log.i("MainViewModel","ViewModel is Created!");
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i("MainViewModel","ViewModel is Destroyed!");
    }

    public void increment(){
        score.setValue(score.getValue() + 1);
    }

    public void decrement(){
        score.setValue(score.getValue() - 1);
    }
}
