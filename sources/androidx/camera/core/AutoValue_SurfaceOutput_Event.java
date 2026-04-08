package androidx.camera.core;

import androidx.camera.core.SurfaceOutput;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SurfaceOutput_Event extends SurfaceOutput.Event {

    /* JADX INFO: renamed from: a */
    public final SurfaceOutput f2190a;

    public AutoValue_SurfaceOutput_Event(SurfaceOutput surfaceOutput) {
        if (surfaceOutput == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.f2190a = surfaceOutput;
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    /* JADX INFO: renamed from: a */
    public final int mo1202a() {
        return 0;
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    /* JADX INFO: renamed from: b */
    public final SurfaceOutput mo1203b() {
        return this.f2190a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceOutput.Event)) {
            return false;
        }
        SurfaceOutput.Event event = (SurfaceOutput.Event) obj;
        return event.mo1202a() == 0 && this.f2190a.equals(event.mo1203b());
    }

    public final int hashCode() {
        return this.f2190a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.f2190a + "}";
    }
}
