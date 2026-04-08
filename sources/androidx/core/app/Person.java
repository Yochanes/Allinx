package androidx.core.app;

import android.app.Person;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Person {

    /* JADX INFO: renamed from: a */
    public String f23079a;

    /* JADX INFO: renamed from: b */
    public IconCompat f23080b;

    /* JADX INFO: renamed from: c */
    public String f23081c;

    /* JADX INFO: renamed from: d */
    public String f23082d;

    /* JADX INFO: renamed from: e */
    public boolean f23083e;

    /* JADX INFO: renamed from: f */
    public boolean f23084f;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api22Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api28Impl {
        /* JADX INFO: renamed from: a */
        public static android.app.Person m7474a(Person person) {
            Person.Builder name = new Person.Builder().setName(person.f23079a);
            IconCompat iconCompat = person.f23080b;
            return name.setIcon(iconCompat != null ? iconCompat.m7619i(null) : null).setUri(person.f23081c).setKey(person.f23082d).setBot(person.f23083e).setImportant(person.f23084f).build();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Builder {

        /* JADX INFO: renamed from: a */
        public String f23085a;

        /* JADX INFO: renamed from: b */
        public IconCompat f23086b;

        /* JADX INFO: renamed from: c */
        public String f23087c;

        /* JADX INFO: renamed from: d */
        public String f23088d;

        /* JADX INFO: renamed from: e */
        public boolean f23089e;

        /* JADX INFO: renamed from: f */
        public boolean f23090f;

        /* JADX INFO: renamed from: a */
        public final Person m7475a() {
            Person person = new Person();
            person.f23079a = this.f23085a;
            person.f23080b = this.f23086b;
            person.f23081c = this.f23087c;
            person.f23082d = this.f23088d;
            person.f23083e = this.f23089e;
            person.f23084f = this.f23090f;
            return person;
        }
    }

    /* JADX INFO: renamed from: a */
    public final android.app.Person m7472a() {
        return Api28Impl.m7474a(this);
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m7473b() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f23079a);
        IconCompat iconCompat = this.f23080b;
        if (iconCompat != null) {
            bundle = new Bundle();
            switch (iconCompat.f23229a) {
                case -1:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.f23230b);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.f23230b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (String) iconCompat.f23230b);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.f23230b);
                    break;
            }
            bundle.putInt("type", iconCompat.f23229a);
            bundle.putInt("int1", iconCompat.f23233e);
            bundle.putInt("int2", iconCompat.f23234f);
            bundle.putString("string1", iconCompat.f23238j);
            ColorStateList colorStateList = iconCompat.f23235g;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f23236h;
            if (mode != IconCompat.f23228k) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f23081c);
        bundle2.putString("key", this.f23082d);
        bundle2.putBoolean("isBot", this.f23083e);
        bundle2.putBoolean("isImportant", this.f23084f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        String str = this.f23082d;
        String str2 = person.f23082d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.f23079a), Objects.toString(person.f23079a)) && Objects.equals(this.f23081c, person.f23081c) && Boolean.valueOf(this.f23083e).equals(Boolean.valueOf(person.f23083e)) && Boolean.valueOf(this.f23084f).equals(Boolean.valueOf(person.f23084f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.f23082d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.f23079a, this.f23081c, Boolean.valueOf(this.f23083e), Boolean.valueOf(this.f23084f));
    }
}
