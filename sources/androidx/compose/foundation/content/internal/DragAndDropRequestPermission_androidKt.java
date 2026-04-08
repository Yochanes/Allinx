package androidx.compose.foundation.content.internal;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import androidx.compose.p013ui.draganddrop.DragAndDropEvent;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.DelegatableNode_androidKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class DragAndDropRequestPermission_androidKt {
    /* JADX INFO: renamed from: a */
    public static final void m2522a(DelegatableNode delegatableNode, DragAndDropEvent dragAndDropEvent) {
        Activity activity;
        ClipData clipData = dragAndDropEvent.f17359a.getClipData();
        int itemCount = clipData.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            Uri uri = clipData.getItemAt(i).getUri();
            if (uri != null && Intrinsics.m18594b(uri.getScheme(), FirebaseAnalytics.Param.CONTENT)) {
                if (delegatableNode.getF17181a().f17194s) {
                    Context context = DelegatableNode_androidKt.m5745a(delegatableNode).getContext();
                    while (true) {
                        if (!(context instanceof ContextWrapper)) {
                            activity = null;
                            break;
                        } else {
                            if (context instanceof Activity) {
                                activity = (Activity) context;
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                    if (activity == null) {
                        return;
                    }
                    activity.requestDragAndDropPermissions(dragAndDropEvent.f17359a);
                    return;
                }
                return;
            }
        }
    }
}
