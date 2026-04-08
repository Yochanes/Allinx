package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class CursorFilter extends Filter {

    /* JADX INFO: renamed from: a */
    public CursorAdapter f23624a;

    /* JADX INFO: compiled from: Proguard */
    public interface CursorFilterClient {
        /* JADX INFO: renamed from: a */
        void mo686a(Cursor cursor);

        /* JADX INFO: renamed from: c */
        String mo687c(Cursor cursor);

        /* JADX INFO: renamed from: d */
        Cursor mo688d(CharSequence charSequence);
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.f23624a.mo687c((Cursor) obj);
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorMo688d = this.f23624a.mo688d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorMo688d != null) {
            filterResults.count = cursorMo688d.getCount();
            filterResults.values = cursorMo688d;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        CursorAdapter cursorAdapter = this.f23624a;
        Cursor cursor = cursorAdapter.f23621b;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        cursorAdapter.mo686a((Cursor) obj);
    }
}
