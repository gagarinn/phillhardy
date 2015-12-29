package cps.ru.criminalintent;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created by Администратор on 21.06.2015.
 */
//@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class CrimeListActivity extends SingleFragmentActivity {

//    ActionBar mAcBar =  getActionBar();


    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
