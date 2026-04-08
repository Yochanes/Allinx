package androidx.media3.extractor.mp3;

import androidx.media3.extractor.SeekMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
interface Seeker extends SeekMap {

    /* JADX INFO: compiled from: Proguard */
    public static class UnseekableSeeker extends SeekMap.Unseekable implements Seeker {
        @Override // androidx.media3.extractor.mp3.Seeker
        /* JADX INFO: renamed from: c */
        public final long mo10891c() {
            return -1L;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        /* JADX INFO: renamed from: e */
        public final long mo10892e(long j) {
            return 0L;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        /* JADX INFO: renamed from: k */
        public final int mo10893k() {
            return -2147483647;
        }
    }

    /* JADX INFO: renamed from: c */
    long mo10891c();

    /* JADX INFO: renamed from: e */
    long mo10892e(long j);

    /* JADX INFO: renamed from: k */
    int mo10893k();
}
