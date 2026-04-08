package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.LoadingInfo;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class CompositeSequenceableLoader implements SequenceableLoader {

    /* JADX INFO: renamed from: a */
    public final ImmutableList f27152a;

    /* JADX INFO: renamed from: b */
    public long f27153b;

    /* JADX INFO: compiled from: Proguard */
    public static final class SequenceableLoaderWithTrackTypes implements SequenceableLoader {

        /* JADX INFO: renamed from: a */
        public final SequenceableLoader f27154a;

        /* JADX INFO: renamed from: b */
        public final ImmutableList f27155b;

        public SequenceableLoaderWithTrackTypes(SequenceableLoader sequenceableLoader, List list) {
            this.f27154a = sequenceableLoader;
            this.f27155b = ImmutableList.copyOf((Collection) list);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        /* JADX INFO: renamed from: c */
        public final boolean mo10464c(LoadingInfo loadingInfo) {
            return this.f27154a.mo10464c(loadingInfo);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        /* JADX INFO: renamed from: e */
        public final long mo10465e() {
            return this.f27154a.mo10465e();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final boolean isLoading() {
            return this.f27154a.isLoading();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        /* JADX INFO: renamed from: r */
        public final long mo10473r() {
            return this.f27154a.mo10473r();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        /* JADX INFO: renamed from: t */
        public final void mo10475t(long j) {
            this.f27154a.mo10475t(j);
        }
    }

    public CompositeSequenceableLoader(List list, List list2) {
        ImmutableList.Builder builder = ImmutableList.builder();
        Assertions.m9460a(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            builder.add(new SequenceableLoaderWithTrackTypes((SequenceableLoader) list.get(i), (List) list2.get(i)));
        }
        this.f27152a = builder.build();
        this.f27153b = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    /* JADX INFO: renamed from: c */
    public final boolean mo10464c(LoadingInfo loadingInfo) {
        boolean zMo10464c;
        boolean z2 = false;
        do {
            long jMo10465e = mo10465e();
            if (jMo10465e == Long.MIN_VALUE) {
                return z2;
            }
            int i = 0;
            zMo10464c = false;
            while (true) {
                ImmutableList immutableList = this.f27152a;
                if (i >= immutableList.size()) {
                    break;
                }
                long jMo10465e2 = ((SequenceableLoaderWithTrackTypes) immutableList.get(i)).f27154a.mo10465e();
                boolean z3 = jMo10465e2 != Long.MIN_VALUE && jMo10465e2 <= loadingInfo.f26225a;
                if (jMo10465e2 == jMo10465e || z3) {
                    zMo10464c |= ((SequenceableLoaderWithTrackTypes) immutableList.get(i)).f27154a.mo10464c(loadingInfo);
                }
                i++;
            }
            z2 |= zMo10464c;
        } while (zMo10464c);
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    /* JADX INFO: renamed from: e */
    public final long mo10465e() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            ImmutableList immutableList = this.f27152a;
            if (i >= immutableList.size()) {
                break;
            }
            long jMo10465e = ((SequenceableLoaderWithTrackTypes) immutableList.get(i)).mo10465e();
            if (jMo10465e != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo10465e);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean isLoading() {
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.f27152a;
            if (i >= immutableList.size()) {
                return false;
            }
            if (((SequenceableLoaderWithTrackTypes) immutableList.get(i)).isLoading()) {
                return true;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    /* JADX INFO: renamed from: r */
    public final long mo10473r() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            ImmutableList immutableList = this.f27152a;
            if (i >= immutableList.size()) {
                break;
            }
            SequenceableLoaderWithTrackTypes sequenceableLoaderWithTrackTypes = (SequenceableLoaderWithTrackTypes) immutableList.get(i);
            long jMo10473r = sequenceableLoaderWithTrackTypes.mo10473r();
            ImmutableList immutableList2 = sequenceableLoaderWithTrackTypes.f27155b;
            if ((immutableList2.contains(1) || immutableList2.contains(2) || immutableList2.contains(4)) && jMo10473r != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo10473r);
            }
            if (jMo10473r != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jMo10473r);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f27153b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.f27153b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    /* JADX INFO: renamed from: t */
    public final void mo10475t(long j) {
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.f27152a;
            if (i >= immutableList.size()) {
                return;
            }
            ((SequenceableLoaderWithTrackTypes) immutableList.get(i)).mo10475t(j);
            i++;
        }
    }
}
