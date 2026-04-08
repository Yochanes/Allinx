package androidx.compose.p013ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/text/font/TypefaceResult;", "Landroidx/compose/runtime/State;", "", "Async", "Immutable", "Landroidx/compose/ui/text/font/TypefaceResult$Async;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface TypefaceResult extends State<Object> {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/ui/text/font/TypefaceResult$Async;", "Landroidx/compose/ui/text/font/TypefaceResult;", "Landroidx/compose/runtime/State;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Async implements TypefaceResult, State<Object> {

        /* JADX INFO: renamed from: a */
        public final AsyncFontListLoader f20324a;

        public Async(AsyncFontListLoader asyncFontListLoader) {
            this.f20324a = asyncFontListLoader;
        }

        @Override // androidx.compose.runtime.State
        /* JADX INFO: renamed from: getValue */
        public final Object getF20325a() {
            return this.f20324a.getF20325a();
        }

        @Override // androidx.compose.p013ui.text.font.TypefaceResult
        /* JADX INFO: renamed from: j */
        public final boolean getF20326b() {
            return this.f20324a.f20231i;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "Landroidx/compose/ui/text/font/TypefaceResult;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Immutable implements TypefaceResult {

        /* JADX INFO: renamed from: a */
        public final Object f20325a;

        /* JADX INFO: renamed from: b */
        public final boolean f20326b;

        public Immutable(Object obj, boolean z2) {
            this.f20325a = obj;
            this.f20326b = z2;
        }

        @Override // androidx.compose.runtime.State
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final Object getF20325a() {
            return this.f20325a;
        }

        @Override // androidx.compose.p013ui.text.font.TypefaceResult
        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getF20326b() {
            return this.f20326b;
        }
    }

    /* JADX INFO: renamed from: j */
    boolean getF20326b();
}
