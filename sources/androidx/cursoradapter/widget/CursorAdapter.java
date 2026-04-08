package androidx.cursoradapter.widget;

import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.cursoradapter.widget.CursorFilter;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class CursorAdapter extends BaseAdapter implements Filterable, CursorFilter.CursorFilterClient {

    /* JADX INFO: renamed from: a */
    public boolean f23620a;

    /* JADX INFO: renamed from: b */
    public Cursor f23621b;

    /* JADX INFO: renamed from: c */
    public int f23622c;

    /* JADX INFO: renamed from: d */
    public CursorFilter f23623d;

    /* JADX INFO: compiled from: Proguard */
    public class MyDataSetObserver extends DataSetObserver {
        @Override // android.database.DataSetObserver
        public final void onChanged() {
            throw null;
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo686a(Cursor cursor) {
        Cursor cursorMo8203h = mo8203h(cursor);
        if (cursorMo8203h != null) {
            cursorMo8203h.close();
        }
    }

    /* JADX INFO: renamed from: c */
    public String mo687c(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    /* JADX INFO: renamed from: d */
    public Cursor mo688d(CharSequence charSequence) {
        return this.f23621b;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo689e(View view, Cursor cursor);

    /* JADX INFO: renamed from: f */
    public View mo8202f(Cursor cursor, ViewGroup viewGroup) {
        return mo690g(cursor, viewGroup);
    }

    /* JADX INFO: renamed from: g */
    public abstract View mo690g(Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f23620a || (cursor = this.f23621b) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f23620a) {
            return null;
        }
        this.f23621b.moveToPosition(i);
        if (view == null) {
            view = mo8202f(this.f23621b, viewGroup);
        }
        mo689e(view, this.f23621b);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f23623d == null) {
            CursorFilter cursorFilter = new CursorFilter();
            cursorFilter.f23624a = this;
            this.f23623d = cursorFilter;
        }
        return this.f23623d;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f23620a || (cursor = this.f23621b) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f23621b;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f23620a && (cursor = this.f23621b) != null && cursor.moveToPosition(i)) {
            return this.f23621b.getLong(this.f23622c);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f23620a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f23621b.moveToPosition(i)) {
            throw new IllegalStateException(AbstractC0000a.m9f(i, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = mo690g(this.f23621b, viewGroup);
        }
        mo689e(view, this.f23621b);
        return view;
    }

    /* JADX INFO: renamed from: h */
    public Cursor mo8203h(Cursor cursor) {
        Cursor cursor2 = this.f23621b;
        if (cursor == cursor2) {
            return null;
        }
        this.f23621b = cursor;
        if (cursor != null) {
            this.f23622c = cursor.getColumnIndexOrThrow("_id");
            this.f23620a = true;
            notifyDataSetChanged();
            return cursor2;
        }
        this.f23622c = -1;
        this.f23620a = false;
        notifyDataSetInvalidated();
        return cursor2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: compiled from: Proguard */
    public class ChangeObserver extends ContentObserver {
        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z2) {
        }
    }
}
