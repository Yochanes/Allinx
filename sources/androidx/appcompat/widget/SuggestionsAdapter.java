package androidx.appcompat.widget;

import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.cursoradapter.widget.ResourceCursorAdapter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class SuggestionsAdapter extends ResourceCursorAdapter implements View.OnClickListener {

    /* JADX INFO: renamed from: f */
    public int f1379f;

    /* JADX INFO: renamed from: g */
    public int f1380g;

    /* JADX INFO: renamed from: i */
    public int f1381i;

    /* JADX INFO: renamed from: j */
    public int f1382j;

    /* JADX INFO: renamed from: n */
    public int f1383n;

    /* JADX INFO: renamed from: o */
    public int f1384o;

    /* JADX INFO: renamed from: p */
    public int f1385p;

    /* JADX INFO: compiled from: Proguard */
    public static final class ChildViewCache {
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    /* JADX INFO: renamed from: a */
    public final void mo686a(Cursor cursor) {
        try {
            super.mo686a(cursor);
            if (cursor != null) {
                this.f1380g = cursor.getColumnIndex("suggest_text_1");
                this.f1381i = cursor.getColumnIndex("suggest_text_2");
                this.f1382j = cursor.getColumnIndex("suggest_text_2_url");
                this.f1383n = cursor.getColumnIndex("suggest_icon_1");
                this.f1384o = cursor.getColumnIndex("suggest_icon_2");
                this.f1385p = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    /* JADX INFO: renamed from: c */
    public final String mo687c(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        int columnIndex = cursor.getColumnIndex("suggest_intent_query");
        String string = null;
        if (columnIndex != -1) {
            try {
                string = cursor.getString(columnIndex);
            } catch (Exception e) {
                Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            }
        }
        string.getClass();
        return string;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    /* JADX INFO: renamed from: d */
    public final Cursor mo688d(CharSequence charSequence) {
        if (charSequence != null) {
            charSequence.toString();
        }
        throw null;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    /* JADX INFO: renamed from: e */
    public final void mo689e(View view, Cursor cursor) {
        ChildViewCache childViewCache = (ChildViewCache) view.getTag();
        int i = this.f1385p;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        childViewCache.getClass();
        int i3 = this.f1379f;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            throw null;
        }
        throw null;
    }

    @Override // androidx.cursoradapter.widget.ResourceCursorAdapter, androidx.cursoradapter.widget.CursorAdapter
    /* JADX INFO: renamed from: g */
    public final View mo690g(Cursor cursor, ViewGroup viewGroup) {
        throw null;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            throw null;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            throw null;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m691i(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            Integer.parseInt(str);
            throw null;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
            return null;
        } catch (NumberFormatException unused2) {
            throw null;
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f23621b;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f23621b;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getTag() instanceof CharSequence) {
            throw null;
        }
    }
}
