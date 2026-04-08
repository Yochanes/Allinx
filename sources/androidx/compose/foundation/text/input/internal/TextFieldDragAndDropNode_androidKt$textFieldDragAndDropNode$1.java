package androidx.compose.foundation.text.input.internal;

import android.content.ClipDescription;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.p013ui.draganddrop.DragAndDropEvent;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "dragAndDropEvent", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "invoke", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$1 extends Lambda implements Function1<DragAndDropEvent, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function0 f9137a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$1(Function0 function0) {
        super(1);
        this.f9137a = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClipDescription clipDescription = ((DragAndDropEvent) obj).f17359a.getClipDescription();
        Iterable<MediaType> iterable = (Iterable) this.f9137a.invoke();
        boolean z2 = false;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (MediaType mediaType : iterable) {
                if (Intrinsics.m18594b(mediaType, MediaType.f5192c) || clipDescription.hasMimeType(mediaType.f5193a)) {
                    z2 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z2);
    }
}
