package androidx.databinding.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.databinding.ObservableList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
class ObservableListAdapter<T> extends BaseAdapter {

    /* JADX INFO: renamed from: androidx.databinding.adapters.ObservableListAdapter$1 */
    /* JADX INFO: compiled from: Proguard */
    class C15161 extends ObservableList.OnListChangedCallback {
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = new TextView(null);
        }
        throw null;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        throw null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = new TextView(null);
        }
        throw null;
    }
}
