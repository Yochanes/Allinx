package androidx.camera.video;

import androidx.camera.video.Recorder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_Recorder_RecordingRecord extends Recorder.RecordingRecord {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Recorder.RecordingRecord)) {
            return false;
        }
        ((Recorder.RecordingRecord) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "RecordingRecord{getOutputOptions=null, getCallbackExecutor=null, getEventListener=null, hasAudioEnabled=false, isPersistent=false, getRecordingId=0}";
    }
}
