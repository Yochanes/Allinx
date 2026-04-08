package coil.request;

import coil.size.Precision;
import coil.size.Scale;
import coil.size.SizeResolver;
import coil.transition.Transition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/request/DefinedRequestOptions;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class DefinedRequestOptions {

    /* JADX INFO: renamed from: a */
    public final SizeResolver f33822a;

    /* JADX INFO: renamed from: b */
    public final Scale f33823b;

    /* JADX INFO: renamed from: c */
    public final DefaultIoScheduler f33824c;

    /* JADX INFO: renamed from: d */
    public final DefaultIoScheduler f33825d;

    /* JADX INFO: renamed from: e */
    public final DefaultIoScheduler f33826e;

    /* JADX INFO: renamed from: f */
    public final Transition.Factory f33827f;

    /* JADX INFO: renamed from: g */
    public final Precision f33828g;

    public DefinedRequestOptions(SizeResolver sizeResolver, Scale scale, DefaultIoScheduler defaultIoScheduler, DefaultIoScheduler defaultIoScheduler2, DefaultIoScheduler defaultIoScheduler3, Transition.Factory factory, Precision precision) {
        this.f33822a = sizeResolver;
        this.f33823b = scale;
        this.f33824c = defaultIoScheduler;
        this.f33825d = defaultIoScheduler2;
        this.f33826e = defaultIoScheduler3;
        this.f33827f = factory;
        this.f33828g = precision;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefinedRequestOptions)) {
            return false;
        }
        DefinedRequestOptions definedRequestOptions = (DefinedRequestOptions) obj;
        definedRequestOptions.getClass();
        return Intrinsics.m18594b(this.f33822a, definedRequestOptions.f33822a) && this.f33823b == definedRequestOptions.f33823b && Intrinsics.m18594b(this.f33824c, definedRequestOptions.f33824c) && Intrinsics.m18594b(this.f33825d, definedRequestOptions.f33825d) && Intrinsics.m18594b(this.f33826e, definedRequestOptions.f33826e) && Intrinsics.m18594b(this.f33827f, definedRequestOptions.f33827f) && this.f33828g == definedRequestOptions.f33828g;
    }

    public final int hashCode() {
        SizeResolver sizeResolver = this.f33822a;
        int iHashCode = (sizeResolver != null ? sizeResolver.hashCode() : 0) * 31;
        Scale scale = this.f33823b;
        int iHashCode2 = (iHashCode + (scale != null ? scale.hashCode() : 0)) * 961;
        DefaultIoScheduler defaultIoScheduler = this.f33824c;
        int iHashCode3 = (iHashCode2 + (defaultIoScheduler != null ? defaultIoScheduler.hashCode() : 0)) * 31;
        DefaultIoScheduler defaultIoScheduler2 = this.f33825d;
        int iHashCode4 = (iHashCode3 + (defaultIoScheduler2 != null ? defaultIoScheduler2.hashCode() : 0)) * 31;
        DefaultIoScheduler defaultIoScheduler3 = this.f33826e;
        int iHashCode5 = (iHashCode4 + (defaultIoScheduler3 != null ? defaultIoScheduler3.hashCode() : 0)) * 31;
        Transition.Factory factory = this.f33827f;
        int iHashCode6 = (iHashCode5 + (factory != null ? factory.hashCode() : 0)) * 31;
        Precision precision = this.f33828g;
        return (iHashCode6 + (precision != null ? precision.hashCode() : 0)) * 887503681;
    }
}
