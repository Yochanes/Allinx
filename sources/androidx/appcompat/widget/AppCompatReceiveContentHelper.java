package androidx.appcompat.widget;

import android.app.Activity;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AppCompatReceiveContentHelper {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class OnDropApi24Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m561a(@NonNull DragEvent dragEvent, @NonNull TextView textView, @NonNull Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                ViewCompat.m7803v(textView, new ContentInfoCompat.Builder(dragEvent.getClipData(), 3).m7708a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static boolean m562b(@NonNull DragEvent dragEvent, @NonNull View view, @NonNull Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            ViewCompat.m7803v(view, new ContentInfoCompat.Builder(dragEvent.getClipData(), 3).m7708a());
            return true;
        }
    }
}
