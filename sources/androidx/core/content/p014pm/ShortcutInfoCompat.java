package androidx.core.content.p014pm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.activity.AbstractC0050i;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.compose.foundation.text.input.internal.AbstractC0743b;
import androidx.compose.p013ui.graphics.layer.AbstractC1226a;
import androidx.core.app.Person;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p011a.AbstractC0025b;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ShortcutInfoCompat {

    /* JADX INFO: renamed from: a */
    public Context f23125a;

    /* JADX INFO: renamed from: b */
    public String f23126b;

    /* JADX INFO: renamed from: c */
    public Intent[] f23127c;

    /* JADX INFO: renamed from: d */
    public ComponentName f23128d;

    /* JADX INFO: renamed from: e */
    public CharSequence f23129e;

    /* JADX INFO: renamed from: f */
    public CharSequence f23130f;

    /* JADX INFO: renamed from: g */
    public CharSequence f23131g;

    /* JADX INFO: renamed from: h */
    public IconCompat f23132h;

    /* JADX INFO: renamed from: i */
    public Person[] f23133i;

    /* JADX INFO: renamed from: j */
    public Set f23134j;

    /* JADX INFO: renamed from: k */
    public LocusIdCompat f23135k;

    /* JADX INFO: renamed from: l */
    public boolean f23136l;

    /* JADX INFO: renamed from: m */
    public int f23137m;

    /* JADX INFO: renamed from: n */
    public PersistableBundle f23138n;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api33Impl {
        /* JADX INFO: renamed from: a */
        public static void m7506a(ShortcutInfo.Builder builder) {
            builder.setExcludedFromSurfaces(0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Surface {
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m7504a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Builder(context, AbstractC0743b.m3388g(it.next())).m7507a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final ShortcutInfo m7505b() {
        AbstractC0743b.m3393l();
        ShortcutInfo.Builder builderM3386e = AbstractC0743b.m3386e(AbstractC0743b.m3385d(AbstractC0743b.m3384c(this.f23125a, this.f23126b), this.f23129e), this.f23127c);
        IconCompat iconCompat = this.f23132h;
        if (iconCompat != null) {
            AbstractC0743b.m3396o(builderM3386e, iconCompat.m7619i(this.f23125a));
        }
        if (!TextUtils.isEmpty(this.f23130f)) {
            AbstractC0743b.m3398q(builderM3386e, this.f23130f);
        }
        if (!TextUtils.isEmpty(this.f23131g)) {
            AbstractC0743b.m3404w(builderM3386e, this.f23131g);
        }
        ComponentName componentName = this.f23128d;
        if (componentName != null) {
            AbstractC0743b.m3395n(builderM3386e, componentName);
        }
        Set set = this.f23134j;
        if (set != null) {
            AbstractC0743b.m3399r(builderM3386e, set);
        }
        AbstractC0743b.m3394m(builderM3386e, this.f23137m);
        PersistableBundle persistableBundle = this.f23138n;
        if (persistableBundle != null) {
            AbstractC0743b.m3397p(builderM3386e, persistableBundle);
        }
        int i = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            Person[] personArr = this.f23133i;
            if (personArr != null && personArr.length > 0) {
                int length = personArr.length;
                android.app.Person[] personArr2 = new android.app.Person[length];
                while (i < length) {
                    personArr2[i] = this.f23133i[i].m7472a();
                    i++;
                }
                AbstractC1226a.m5455k(builderM3386e, personArr2);
            }
            LocusIdCompat locusIdCompat = this.f23135k;
            if (locusIdCompat != null) {
                AbstractC1226a.m5453i(builderM3386e, locusIdCompat.f23122b);
            }
            AbstractC1226a.m5454j(builderM3386e, this.f23136l);
        } else {
            if (this.f23138n == null) {
                this.f23138n = new PersistableBundle();
            }
            Person[] personArr3 = this.f23133i;
            if (personArr3 != null && personArr3.length > 0) {
                this.f23138n.putInt("extraPersonCount", personArr3.length);
                while (i < this.f23133i.length) {
                    PersistableBundle persistableBundle2 = this.f23138n;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i2 = i + 1;
                    sb.append(i2);
                    String string = sb.toString();
                    Person person = this.f23133i[i];
                    person.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    String str = person.f23079a;
                    persistableBundle3.putString("name", str != null ? str.toString() : null);
                    persistableBundle3.putString("uri", person.f23081c);
                    persistableBundle3.putString("key", person.f23082d);
                    persistableBundle3.putBoolean("isBot", person.f23083e);
                    persistableBundle3.putBoolean("isImportant", person.f23084f);
                    persistableBundle2.putPersistableBundle(string, persistableBundle3);
                    i = i2;
                }
            }
            LocusIdCompat locusIdCompat2 = this.f23135k;
            if (locusIdCompat2 != null) {
                this.f23138n.putString("extraLocusId", locusIdCompat2.f23121a);
            }
            this.f23138n.putBoolean("extraLongLived", this.f23136l);
            AbstractC0743b.m3397p(builderM3386e, this.f23138n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.m7506a(builderM3386e);
        }
        return AbstractC0743b.m3387f(builderM3386e);
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Builder {

        /* JADX INFO: renamed from: a */
        public final ShortcutInfoCompat f23139a;

        /* JADX INFO: renamed from: b */
        public boolean f23140b;

        public Builder(Context context, String str) {
            ShortcutInfoCompat shortcutInfoCompat = new ShortcutInfoCompat();
            this.f23139a = shortcutInfoCompat;
            shortcutInfoCompat.f23125a = context;
            shortcutInfoCompat.f23126b = str;
        }

        /* JADX INFO: renamed from: a */
        public final ShortcutInfoCompat m7507a() {
            ShortcutInfoCompat shortcutInfoCompat = this.f23139a;
            if (TextUtils.isEmpty(shortcutInfoCompat.f23129e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            Intent[] intentArr = shortcutInfoCompat.f23127c;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.f23140b) {
                if (shortcutInfoCompat.f23135k == null) {
                    shortcutInfoCompat.f23135k = new LocusIdCompat(shortcutInfoCompat.f23126b);
                }
                shortcutInfoCompat.f23136l = true;
            }
            return shortcutInfoCompat;
        }

        public Builder(Context context, ShortcutInfo shortcutInfo) {
            Person[] personArr;
            String string;
            ShortcutInfoCompat shortcutInfoCompat = new ShortcutInfoCompat();
            this.f23139a = shortcutInfoCompat;
            shortcutInfoCompat.f23125a = context;
            shortcutInfoCompat.f23126b = AbstractC0743b.m3391j(shortcutInfo);
            AbstractC0743b.m3400s(shortcutInfo);
            Intent[] intentArrM3402u = AbstractC0743b.m3402u(shortcutInfo);
            shortcutInfoCompat.f23127c = (Intent[]) Arrays.copyOf(intentArrM3402u, intentArrM3402u.length);
            shortcutInfoCompat.f23128d = AbstractC0743b.m3383b(shortcutInfo);
            shortcutInfoCompat.f23129e = AbstractC0743b.m3390i(shortcutInfo);
            shortcutInfoCompat.f23130f = AbstractC0743b.m3403v(shortcutInfo);
            shortcutInfoCompat.f23131g = AbstractC0743b.m3406y(shortcutInfo);
            if (Build.VERSION.SDK_INT >= 28) {
                AbstractC0050i.m210o(shortcutInfo);
            } else {
                AbstractC1430a.m7518e(shortcutInfo);
            }
            shortcutInfoCompat.f23134j = AbstractC0743b.m3392k(shortcutInfo);
            PersistableBundle persistableBundleM3389h = AbstractC0743b.m3389h(shortcutInfo);
            LocusIdCompat locusIdCompat = null;
            if (persistableBundleM3389h == null || !persistableBundleM3389h.containsKey("extraPersonCount")) {
                personArr = null;
            } else {
                int i = persistableBundleM3389h.getInt("extraPersonCount");
                personArr = new Person[i];
                int i2 = 0;
                while (i2 < i) {
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i3 = i2 + 1;
                    sb.append(i3);
                    PersistableBundle persistableBundle = persistableBundleM3389h.getPersistableBundle(sb.toString());
                    Person.Builder builder = new Person.Builder();
                    builder.f23085a = persistableBundle.getString("name");
                    builder.f23087c = persistableBundle.getString("uri");
                    builder.f23088d = persistableBundle.getString("key");
                    builder.f23089e = persistableBundle.getBoolean("isBot");
                    builder.f23090f = persistableBundle.getBoolean("isImportant");
                    personArr[i2] = builder.m7475a();
                    i2 = i3;
                }
            }
            shortcutInfoCompat.f23133i = personArr;
            AbstractC0743b.m3405x(shortcutInfo);
            AbstractC0743b.m3407z(shortcutInfo);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                AbstractC0025b.m121m(shortcutInfo);
            }
            AbstractC0743b.m3378A(shortcutInfo);
            AbstractC0743b.m3379B(shortcutInfo);
            AbstractC0743b.m3380C(shortcutInfo);
            AbstractC0743b.m3381D(shortcutInfo);
            AbstractC1430a.m7518e(shortcutInfo);
            AbstractC1430a.m7525l(shortcutInfo);
            ShortcutInfoCompat shortcutInfoCompat2 = this.f23139a;
            if (i4 >= 29) {
                if (AbstractC1226a.m5447c(shortcutInfo) != null) {
                    locusIdCompat = LocusIdCompat.m7500a(AbstractC1226a.m5447c(shortcutInfo));
                }
            } else {
                PersistableBundle persistableBundleM3389h2 = AbstractC0743b.m3389h(shortcutInfo);
                if (persistableBundleM3389h2 != null && (string = persistableBundleM3389h2.getString("extraLocusId")) != null) {
                    locusIdCompat = new LocusIdCompat(string);
                }
            }
            shortcutInfoCompat2.f23135k = locusIdCompat;
            this.f23139a.f23137m = AbstractC0743b.m3382a(shortcutInfo);
            this.f23139a.f23138n = AbstractC0743b.m3389h(shortcutInfo);
        }
    }
}
