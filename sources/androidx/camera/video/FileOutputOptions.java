package androidx.camera.video;

import androidx.annotation.RequiresApi;
import androidx.camera.video.OutputOptions;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class FileOutputOptions extends OutputOptions {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class Builder extends OutputOptions.Builder<FileOutputOptions, Builder> {
    }

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class FileOutputOptionsInternal extends OutputOptions.OutputOptionsInternal {

        /* JADX INFO: compiled from: Proguard */
        @AutoValue.Builder
        public static abstract class Builder extends OutputOptions.OutputOptionsInternal.Builder<Builder> {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileOutputOptions)) {
            return false;
        }
        ((FileOutputOptions) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
