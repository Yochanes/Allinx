package androidx.compose.p013ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.p013ui.platform.AndroidComposeView;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "TextInputCommand", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Deprecated
@SourceDebugExtension
public final class TextInputServiceAndroid implements PlatformTextInputService {

    /* JADX INFO: renamed from: a */
    public final View f20410a;

    /* JADX INFO: renamed from: b */
    public final InputMethodManagerImpl f20411b;

    /* JADX INFO: renamed from: c */
    public final ExecutorC1336b f20412c;

    /* JADX INFO: renamed from: d */
    public boolean f20413d;

    /* JADX INFO: renamed from: e */
    public Lambda f20414e;

    /* JADX INFO: renamed from: f */
    public Lambda f20415f;

    /* JADX INFO: renamed from: g */
    public TextFieldValue f20416g;

    /* JADX INFO: renamed from: h */
    public ImeOptions f20417h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f20418i;

    /* JADX INFO: renamed from: j */
    public final Object f20419j;

    /* JADX INFO: renamed from: k */
    public Rect f20420k;

    /* JADX INFO: renamed from: l */
    public final CursorAnchorInfoController f20421l;

    /* JADX INFO: renamed from: m */
    public final MutableVector f20422m;

    /* JADX INFO: renamed from: n */
    public RunnableC1335a f20423n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class TextInputCommand {

        /* JADX INFO: renamed from: a */
        public static final TextInputCommand f20424a;

        /* JADX INFO: renamed from: b */
        public static final TextInputCommand f20425b;

        /* JADX INFO: renamed from: c */
        public static final TextInputCommand f20426c;

        /* JADX INFO: renamed from: d */
        public static final TextInputCommand f20427d;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ TextInputCommand[] f20428f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ EnumEntries f20429g;

        static {
            TextInputCommand textInputCommand = new TextInputCommand("StartInput", 0);
            f20424a = textInputCommand;
            TextInputCommand textInputCommand2 = new TextInputCommand("StopInput", 1);
            f20425b = textInputCommand2;
            TextInputCommand textInputCommand3 = new TextInputCommand("ShowKeyboard", 2);
            f20426c = textInputCommand3;
            TextInputCommand textInputCommand4 = new TextInputCommand("HideKeyboard", 3);
            f20427d = textInputCommand4;
            TextInputCommand[] textInputCommandArr = {textInputCommand, textInputCommand2, textInputCommand3, textInputCommand4};
            f20428f = textInputCommandArr;
            f20429g = EnumEntriesKt.m18563a(textInputCommandArr);
        }

        public static TextInputCommand valueOf(String str) {
            return (TextInputCommand) Enum.valueOf(TextInputCommand.class, str);
        }

        public static TextInputCommand[] values() {
            return (TextInputCommand[]) f20428f.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TextInputCommand.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TextInputCommand textInputCommand = TextInputCommand.f20424a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TextInputCommand textInputCommand2 = TextInputCommand.f20424a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TextInputCommand textInputCommand3 = TextInputCommand.f20424a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public TextInputServiceAndroid(View view, AndroidComposeView androidComposeView) {
        InputMethodManagerImpl inputMethodManagerImpl = new InputMethodManagerImpl(view);
        ExecutorC1336b executorC1336b = new ExecutorC1336b(Choreographer.getInstance());
        this.f20410a = view;
        this.f20411b = inputMethodManagerImpl;
        this.f20412c = executorC1336b;
        this.f20414e = TextInputServiceAndroid$onEditCommand$1.f20432a;
        this.f20415f = TextInputServiceAndroid$onImeActionPerformed$1.f20433a;
        this.f20416g = new TextFieldValue("", TextRange.f20115b, 4);
        this.f20417h = ImeOptions.f20367h;
        this.f20418i = new ArrayList();
        this.f20419j = LazyKt.m18298a(LazyThreadSafetyMode.f51423c, new TextInputServiceAndroid$baseInputConnection$2(this));
        this.f20421l = new CursorAnchorInfoController(androidComposeView, inputMethodManagerImpl);
        this.f20422m = new MutableVector(new TextInputCommand[16], 0);
    }

    @Override // androidx.compose.p013ui.text.input.PlatformTextInputService
    /* JADX INFO: renamed from: a */
    public final void mo3292a() {
        m6566i(TextInputCommand.f20424a);
    }

    @Override // androidx.compose.p013ui.text.input.PlatformTextInputService
    /* JADX INFO: renamed from: b */
    public final void mo3339b() {
        m6566i(TextInputCommand.f20426c);
    }

    @Override // androidx.compose.p013ui.text.input.PlatformTextInputService
    /* JADX INFO: renamed from: c */
    public final void mo3293c() {
        this.f20413d = false;
        this.f20414e = TextInputServiceAndroid$stopInput$1.f20434a;
        this.f20415f = TextInputServiceAndroid$stopInput$2.f20435a;
        this.f20420k = null;
        m6566i(TextInputCommand.f20425b);
    }

    @Override // androidx.compose.p013ui.text.input.PlatformTextInputService
    /* JADX INFO: renamed from: d */
    public final void mo3340d() {
        m6566i(TextInputCommand.f20427d);
    }

    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.compose.p013ui.text.input.PlatformTextInputService
    /* JADX INFO: renamed from: e */
    public final void mo3294e(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z2 = (TextRange.m6403b(this.f20416g.f20404b, textFieldValue2.f20404b) && Intrinsics.m18594b(this.f20416g.f20405c, textFieldValue2.f20405c)) ? false : true;
        this.f20416g = textFieldValue2;
        int size = this.f20418i.size();
        for (int i = 0; i < size; i++) {
            RecordingInputConnection recordingInputConnection = (RecordingInputConnection) ((WeakReference) this.f20418i.get(i)).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.f20391d = textFieldValue2;
            }
        }
        CursorAnchorInfoController cursorAnchorInfoController = this.f20421l;
        synchronized (cursorAnchorInfoController.f20331c) {
            cursorAnchorInfoController.f20338j = null;
            cursorAnchorInfoController.f20340l = null;
            cursorAnchorInfoController.f20339k = null;
            cursorAnchorInfoController.f20341m = CursorAnchorInfoController$invalidate$1$1.f20347a;
            cursorAnchorInfoController.f20342n = null;
            cursorAnchorInfoController.f20343o = null;
        }
        if (Intrinsics.m18594b(textFieldValue, textFieldValue2)) {
            if (z2) {
                InputMethodManagerImpl inputMethodManagerImpl = this.f20411b;
                int iM6407f = TextRange.m6407f(textFieldValue2.f20404b);
                int iM6406e = TextRange.m6406e(textFieldValue2.f20404b);
                TextRange textRange = this.f20416g.f20405c;
                int iM6407f2 = textRange != null ? TextRange.m6407f(textRange.f20117a) : -1;
                TextRange textRange2 = this.f20416g.f20405c;
                inputMethodManagerImpl.m6548a(iM6407f, iM6406e, iM6407f2, textRange2 != null ? TextRange.m6406e(textRange2.f20117a) : -1);
                return;
            }
            return;
        }
        if (textFieldValue != null && (!Intrinsics.m18594b(textFieldValue.f20403a.f19890b, textFieldValue2.f20403a.f19890b) || (TextRange.m6403b(textFieldValue.f20404b, textFieldValue2.f20404b) && !Intrinsics.m18594b(textFieldValue.f20405c, textFieldValue2.f20405c)))) {
            InputMethodManagerImpl inputMethodManagerImpl2 = this.f20411b;
            ((InputMethodManager) inputMethodManagerImpl2.f20376b.getValue()).restartInput(inputMethodManagerImpl2.f20375a);
            return;
        }
        int size2 = this.f20418i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            RecordingInputConnection recordingInputConnection2 = (RecordingInputConnection) ((WeakReference) this.f20418i.get(i2)).get();
            if (recordingInputConnection2 != null) {
                TextFieldValue textFieldValue3 = this.f20416g;
                InputMethodManagerImpl inputMethodManagerImpl3 = this.f20411b;
                if (recordingInputConnection2.f20395h) {
                    recordingInputConnection2.f20391d = textFieldValue3;
                    if (recordingInputConnection2.f20393f) {
                        ((InputMethodManager) inputMethodManagerImpl3.f20376b.getValue()).updateExtractedText(inputMethodManagerImpl3.f20375a, recordingInputConnection2.f20392e, InputState_androidKt.m6549a(textFieldValue3));
                    }
                    TextRange textRange3 = textFieldValue3.f20405c;
                    int iM6407f3 = textRange3 != null ? TextRange.m6407f(textRange3.f20117a) : -1;
                    TextRange textRange4 = textFieldValue3.f20405c;
                    int iM6406e2 = textRange4 != null ? TextRange.m6406e(textRange4.f20117a) : -1;
                    long j = textFieldValue3.f20404b;
                    inputMethodManagerImpl3.m6548a(TextRange.m6407f(j), TextRange.m6406e(j), iM6407f3, iM6406e2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p013ui.text.input.PlatformTextInputService
    /* JADX INFO: renamed from: f */
    public final void mo3295f(TextFieldValue textFieldValue, ImeOptions imeOptions, Function1 function1, Function1 function12) {
        this.f20413d = true;
        this.f20416g = textFieldValue;
        this.f20417h = imeOptions;
        this.f20414e = (Lambda) function1;
        this.f20415f = (Lambda) function12;
        m6566i(TextInputCommand.f20424a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p013ui.text.input.PlatformTextInputService
    /* JADX INFO: renamed from: g */
    public final void mo3296g(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1 function1, androidx.compose.p013ui.geometry.Rect rect, androidx.compose.p013ui.geometry.Rect rect2) {
        CursorAnchorInfoController cursorAnchorInfoController = this.f20421l;
        synchronized (cursorAnchorInfoController.f20331c) {
            try {
                cursorAnchorInfoController.f20338j = textFieldValue;
                cursorAnchorInfoController.f20340l = offsetMapping;
                cursorAnchorInfoController.f20339k = textLayoutResult;
                cursorAnchorInfoController.f20341m = (Lambda) function1;
                cursorAnchorInfoController.f20342n = rect;
                cursorAnchorInfoController.f20343o = rect2;
                if (cursorAnchorInfoController.f20333e || cursorAnchorInfoController.f20332d) {
                    cursorAnchorInfoController.m6533a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.p013ui.text.input.PlatformTextInputService
    /* JADX INFO: renamed from: h */
    public final void mo3297h(androidx.compose.p013ui.geometry.Rect rect) {
        Rect rect2;
        this.f20420k = new Rect(MathKt.m18640b(rect.f17526a), MathKt.m18640b(rect.f17527b), MathKt.m18640b(rect.f17528c), MathKt.m18640b(rect.f17529d));
        if (!this.f20418i.isEmpty() || (rect2 = this.f20420k) == null) {
            return;
        }
        this.f20410a.requestRectangleOnScreen(new Rect(rect2));
    }

    /* JADX INFO: renamed from: i */
    public final void m6566i(TextInputCommand textInputCommand) {
        this.f20422m.m4568b(textInputCommand);
        if (this.f20423n == null) {
            RunnableC1335a runnableC1335a = new RunnableC1335a(this);
            this.f20412c.execute(runnableC1335a);
            this.f20423n = runnableC1335a;
        }
    }
}
