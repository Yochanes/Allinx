package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class Key {

    /* JADX INFO: renamed from: a */
    public int f22173a = -1;

    /* JADX INFO: renamed from: b */
    public int f22174b = -1;

    /* JADX INFO: renamed from: c */
    public String f22175c = null;

    /* JADX INFO: renamed from: d */
    public HashMap f22176d;

    /* JADX INFO: renamed from: g */
    public static float m7214g(Number number) {
        return number instanceof Float ? ((Float) number).floatValue() : Float.parseFloat(number.toString());
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo7215a(HashMap map);

    /* JADX INFO: renamed from: b */
    public abstract Key mo7216b();

    /* JADX INFO: renamed from: c */
    public Key m7217c(Key key) {
        this.f22173a = key.f22173a;
        this.f22174b = key.f22174b;
        this.f22175c = key.f22175c;
        this.f22176d = key.f22176d;
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return mo7216b();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo7218d(HashSet hashSet);

    /* JADX INFO: renamed from: e */
    public abstract void mo7219e(Context context, AttributeSet attributeSet);

    /* JADX INFO: renamed from: f */
    public void mo7220f(HashMap map) {
    }
}
