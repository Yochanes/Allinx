package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentListener;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public final class TextViewOnReceiveContentListener implements OnReceiveContentListener {
    @Override // androidx.core.view.OnReceiveContentListener
    /* JADX INFO: renamed from: a */
    public final ContentInfoCompat mo7758a(View view, ContentInfoCompat contentInfoCompat) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + contentInfoCompat);
        }
        if (contentInfoCompat.m7707c() == 2) {
            return contentInfoCompat;
        }
        ClipData clipDataM7705a = contentInfoCompat.m7705a();
        int iM7706b = contentInfoCompat.m7706b();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z2 = false;
        for (int i = 0; i < clipDataM7705a.getItemCount(); i++) {
            ClipData.Item itemAt = clipDataM7705a.getItemAt(i);
            if ((iM7706b & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z2) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z2 = true;
                }
            }
        }
        return null;
    }
}
