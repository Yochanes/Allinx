package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
final class EmojiKeyListener implements KeyListener {

    /* JADX INFO: renamed from: a */
    public final KeyListener f24391a;

    /* JADX INFO: compiled from: Proguard */
    public static class EmojiCompatHandleKeyDownHelper {
    }

    public EmojiKeyListener(KeyListener keyListener) {
        this.f24391a = keyListener;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f24391a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f24391a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return EmojiCompat.m8784f(editable, i, keyEvent) || this.f24391a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f24391a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f24391a.onKeyUp(view, editable, i, keyEvent);
    }
}
