package androidx.databinding.adapters;

import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingMethods;
import androidx.databinding.InverseBindingMethods;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@BindingMethods
@InverseBindingMethods
@RestrictTo
public class AdapterViewBindingAdapter {

    /* JADX INFO: compiled from: Proguard */
    public interface OnItemSelected {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnNothingSelected {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class OnItemSelectedComponentListener implements AdapterView.OnItemSelectedListener {
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView adapterView) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        }
    }
}
