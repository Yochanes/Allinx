package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AppCompatTextClassifierHelper {

    /* JADX INFO: renamed from: a */
    public TextView f1187a;

    /* JADX INFO: renamed from: b */
    public TextClassifier f1188b;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class Api26Impl {
        @NonNull
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static TextClassifier m579a(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }
}
