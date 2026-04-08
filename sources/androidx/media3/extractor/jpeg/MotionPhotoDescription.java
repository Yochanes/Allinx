package androidx.media3.extractor.jpeg;

import com.google.common.collect.ImmutableList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class MotionPhotoDescription {

    /* JADX INFO: renamed from: a */
    public final long f28434a;

    /* JADX INFO: renamed from: b */
    public final ImmutableList f28435b;

    /* JADX INFO: compiled from: Proguard */
    public static final class ContainerItem {

        /* JADX INFO: renamed from: a */
        public final String f28436a;

        /* JADX INFO: renamed from: b */
        public final long f28437b;

        /* JADX INFO: renamed from: c */
        public final long f28438c;

        public ContainerItem(String str, long j, long j2) {
            this.f28436a = str;
            this.f28437b = j;
            this.f28438c = j2;
        }
    }

    public MotionPhotoDescription(long j, ImmutableList immutableList) {
        this.f28434a = j;
        this.f28435b = immutableList;
    }
}
