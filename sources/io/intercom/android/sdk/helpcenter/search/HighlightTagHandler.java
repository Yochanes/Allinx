package io.intercom.android.sdk.helpcenter.search;

import android.text.Editable;
import android.text.Html;
import android.text.style.StyleSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import com.engagelab.privates.push.constants.MTPushConstants;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xml.sax.XMLReader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/search/HighlightTagHandler;", "Landroid/text/Html$TagHandler;", "<init>", "()V", "startIndex", "", "endIndex", "handleTag", "", "opening", "", MTPushConstants.Operation.KEY_TAG, "", "output", "Landroid/text/Editable;", "xmlReader", "Lorg/xml/sax/XMLReader;", "applyColorSpan", AttributeType.TEXT, "Companion", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class HighlightTagHandler implements Html.TagHandler {
    private static final int SPAN_FLAG = 33;
    private int endIndex;
    private int startIndex;
    public static final int $stable = 8;

    private final void applyColorSpan(Editable text) {
        text.setSpan(new StyleSpan(1), this.startIndex, this.endIndex, 33);
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean opening, @NotNull String tag, @NotNull Editable output, @NotNull XMLReader xmlReader) {
        Intrinsics.m18599g(tag, "tag");
        Intrinsics.m18599g(output, "output");
        Intrinsics.m18599g(xmlReader, "xmlReader");
        if (tag.equalsIgnoreCase("highlight")) {
            if (opening) {
                this.startIndex = output.length();
            } else {
                this.endIndex = output.length();
                applyColorSpan(output);
            }
        }
    }
}
