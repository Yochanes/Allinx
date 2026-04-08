package androidx.camera.core;

import androidx.camera.core.ImageReaderFormatRecommender;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_ImageReaderFormatRecommender_FormatCombo extends ImageReaderFormatRecommender.FormatCombo {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageReaderFormatRecommender.FormatCombo)) {
            return false;
        }
        ((ImageReaderFormatRecommender.FormatCombo) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return -721379959;
    }

    public final String toString() {
        return "FormatCombo{imageCaptureFormat=0, imageAnalysisFormat=0}";
    }
}
