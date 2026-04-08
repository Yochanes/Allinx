package androidx.core.widget;

import android.widget.ListView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ListViewAutoScrollHelper extends AutoScrollHelper {

    /* JADX INFO: renamed from: w */
    public final ListView f23580w;

    public ListViewAutoScrollHelper(ListView listView) {
        super(listView);
        this.f23580w = listView;
    }

    @Override // androidx.core.widget.AutoScrollHelper
    /* JADX INFO: renamed from: a */
    public final boolean mo8158a(int i) {
        ListView listView = this.f23580w;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AutoScrollHelper
    /* JADX INFO: renamed from: f */
    public final void mo8162f(int i) {
        this.f23580w.scrollListBy(i);
    }
}
