package kotlin.reflect.jvm.internal.impl.descriptors;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Visibilities {

    /* JADX INFO: renamed from: a */
    public static final MapBuilder f52304a;

    /* JADX INFO: compiled from: Proguard */
    public static final class Inherited extends Visibility {

        /* JADX INFO: renamed from: c */
        public static final Inherited f52305c = new Inherited("inherited", false);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Internal extends Visibility {

        /* JADX INFO: renamed from: c */
        public static final Internal f52306c = new Internal("internal", false);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class InvisibleFake extends Visibility {

        /* JADX INFO: renamed from: c */
        public static final InvisibleFake f52307c = new InvisibleFake("invisible_fake", false);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Local extends Visibility {

        /* JADX INFO: renamed from: c */
        public static final Local f52308c = new Local(ImagesContract.LOCAL, false);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Private extends Visibility {

        /* JADX INFO: renamed from: c */
        public static final Private f52309c = new Private("private", false);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PrivateToThis extends Visibility {

        /* JADX INFO: renamed from: c */
        public static final PrivateToThis f52310c = new PrivateToThis("private_to_this", false);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        /* JADX INFO: renamed from: b */
        public final String mo18985b() {
            return "private/*private to this*/";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Protected extends Visibility {

        /* JADX INFO: renamed from: c */
        public static final Protected f52311c = new Protected("protected", true);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Public extends Visibility {

        /* JADX INFO: renamed from: c */
        public static final Public f52312c = new Public("public", true);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Unknown extends Visibility {

        /* JADX INFO: renamed from: c */
        public static final Unknown f52313c = new Unknown("unknown", false);
    }

    static {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(PrivateToThis.f52310c, 0);
        mapBuilder.put(Private.f52309c, 0);
        mapBuilder.put(Internal.f52306c, 1);
        mapBuilder.put(Protected.f52311c, 1);
        mapBuilder.put(Public.f52312c, 2);
        f52304a = mapBuilder.m18531e();
    }
}
