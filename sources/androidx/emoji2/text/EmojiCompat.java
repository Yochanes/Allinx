package androidx.emoji2.text;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiExclusions;
import androidx.emoji2.text.EmojiProcessor;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AnyThread
public class EmojiCompat {

    /* JADX INFO: renamed from: j */
    public static final Object f24278j = new Object();

    /* JADX INFO: renamed from: k */
    public static volatile EmojiCompat f24279k;

    /* JADX INFO: renamed from: a */
    public final ReentrantReadWriteLock f24280a;

    /* JADX INFO: renamed from: b */
    public final ArraySet f24281b;

    /* JADX INFO: renamed from: c */
    public volatile int f24282c;

    /* JADX INFO: renamed from: d */
    public final Handler f24283d;

    /* JADX INFO: renamed from: e */
    public final CompatInternal19 f24284e;

    /* JADX INFO: renamed from: f */
    public final MetadataRepoLoader f24285f;

    /* JADX INFO: renamed from: g */
    public final DefaultSpanFactory f24286g;

    /* JADX INFO: renamed from: h */
    public final int f24287h;

    /* JADX INFO: renamed from: i */
    public final GlyphChecker f24288i;

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface CodepointSequenceMatchResult {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CompatInternal {

        /* JADX INFO: renamed from: a */
        public final EmojiCompat f24289a;

        public CompatInternal(EmojiCompat emojiCompat) {
            this.f24289a = emojiCompat;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class CompatInternal19 extends CompatInternal {

        /* JADX INFO: renamed from: b */
        public volatile EmojiProcessor f24290b;

        /* JADX INFO: renamed from: c */
        public volatile MetadataRepo f24291c;

        /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompat$CompatInternal19$1 */
        /* JADX INFO: compiled from: Proguard */
        class C16331 extends MetadataRepoLoaderCallback {
            public C16331() {
            }

            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            /* JADX INFO: renamed from: a */
            public final void mo8794a(Throwable th) {
                CompatInternal19.this.f24289a.m8790i(th);
            }

            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            /* JADX INFO: renamed from: b */
            public final void mo8795b(MetadataRepo metadataRepo) {
                CompatInternal19 compatInternal19 = CompatInternal19.this;
                compatInternal19.f24291c = metadataRepo;
                MetadataRepo metadataRepo2 = compatInternal19.f24291c;
                EmojiCompat emojiCompat = compatInternal19.f24289a;
                compatInternal19.f24290b = new EmojiProcessor(metadataRepo2, emojiCompat.f24286g, emojiCompat.f24288i, Build.VERSION.SDK_INT >= 34 ? EmojiExclusions.EmojiExclusions_Api34.m8797a() : EmojiExclusions.EmojiExclusions_Reflections.m8798a());
                EmojiCompat emojiCompat2 = compatInternal19.f24289a;
                emojiCompat2.getClass();
                ArrayList arrayList = new ArrayList();
                emojiCompat2.f24280a.writeLock().lock();
                try {
                    emojiCompat2.f24282c = 1;
                    arrayList.addAll(emojiCompat2.f24281b);
                    emojiCompat2.f24281b.clear();
                    emojiCompat2.f24280a.writeLock().unlock();
                    emojiCompat2.f24283d.post(new ListenerDispatcher(arrayList, emojiCompat2.f24282c, null));
                } catch (Throwable th) {
                    emojiCompat2.f24280a.writeLock().unlock();
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Config {

        /* JADX INFO: renamed from: a */
        public final MetadataRepoLoader f24293a;

        /* JADX INFO: renamed from: b */
        public int f24294b = 0;

        /* JADX INFO: renamed from: c */
        public final GlyphChecker f24295c = new DefaultGlyphChecker();

        public Config(MetadataRepoLoader metadataRepoLoader) {
            this.f24293a = metadataRepoLoader;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public static class DefaultSpanFactory implements SpanFactory {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface GlyphChecker {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ListenerDispatcher implements Runnable {

        /* JADX INFO: renamed from: a */
        public final ArrayList f24296a;

        /* JADX INFO: renamed from: b */
        public final int f24297b;

        public ListenerDispatcher(List list, int i, Throwable th) {
            Preconditions.m7698e(list, "initCallbacks cannot be null");
            this.f24296a = new ArrayList(list);
            this.f24297b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f24296a;
            int size = arrayList.size();
            int i = 0;
            if (this.f24297b != 1) {
                while (i < size) {
                    ((InitCallback) arrayList.get(i)).mo695a();
                    i++;
                }
            } else {
                while (i < size) {
                    ((InitCallback) arrayList.get(i)).mo696b();
                    i++;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface LoadStrategy {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface MetadataRepoLoader {
        /* JADX INFO: renamed from: a */
        void mo8796a(MetadataRepoLoaderCallback metadataRepoLoaderCallback);
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class MetadataRepoLoaderCallback {
        /* JADX INFO: renamed from: a */
        public abstract void mo8794a(Throwable th);

        /* JADX INFO: renamed from: b */
        public abstract void mo8795b(MetadataRepo metadataRepo);
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ReplaceStrategy {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface SpanFactory {
    }

    public EmojiCompat(Config config) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f24280a = reentrantReadWriteLock;
        this.f24282c = 3;
        MetadataRepoLoader metadataRepoLoader = config.f24293a;
        this.f24285f = metadataRepoLoader;
        int i = config.f24294b;
        this.f24287h = i;
        this.f24288i = config.f24295c;
        this.f24283d = new Handler(Looper.getMainLooper());
        this.f24281b = new ArraySet(0);
        this.f24286g = new DefaultSpanFactory();
        CompatInternal19 compatInternal19 = new CompatInternal19(this);
        this.f24284e = compatInternal19;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f24282c = 0;
            } catch (Throwable th) {
                this.f24280a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m8788d() == 0) {
            try {
                metadataRepoLoader.mo8796a(compatInternal19.new C16331());
            } catch (Throwable th2) {
                m8790i(th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static EmojiCompat m8782a() {
        EmojiCompat emojiCompat;
        synchronized (f24278j) {
            emojiCompat = f24279k;
            Preconditions.m7699f(emojiCompat != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return emojiCompat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m8783e(InputConnection inputConnection, Editable editable, int i, int i2, boolean z2) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z2) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart < 0 || length < selectionStart || iMax < 0) {
                        selectionStart = -1;
                        int iMax2 = Math.max(i2, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0 || iMin < selectionEnd || iMax2 < 0) {
                            iMin = -1;
                            if (selectionStart != -1 && iMin != -1) {
                            }
                        } else {
                            loop2: while (true) {
                                boolean z3 = false;
                                while (true) {
                                    if (iMax2 == 0) {
                                        iMin = selectionEnd;
                                        break loop2;
                                    }
                                    if (selectionEnd >= iMin) {
                                        if (z3) {
                                            break;
                                        }
                                    } else {
                                        char cCharAt = editable.charAt(selectionEnd);
                                        if (z3) {
                                            break;
                                        }
                                        if (!Character.isSurrogate(cCharAt)) {
                                            iMax2--;
                                            selectionEnd++;
                                        } else {
                                            if (Character.isLowSurrogate(cCharAt)) {
                                                break loop2;
                                            }
                                            selectionEnd++;
                                            z3 = true;
                                        }
                                    }
                                }
                                iMax2--;
                                selectionEnd++;
                            }
                            iMin = -1;
                            if (selectionStart != -1) {
                            }
                        }
                    } else {
                        loop0: while (true) {
                            boolean z4 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char cCharAt2 = editable.charAt(selectionStart);
                                    if (z4) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(cCharAt2)) {
                                        iMax--;
                                    } else {
                                        if (Character.isHighSurrogate(cCharAt2)) {
                                            break loop0;
                                        }
                                        z4 = true;
                                    }
                                } else {
                                    if (z4) {
                                        break loop0;
                                    }
                                    selectionStart = 0;
                                }
                            }
                            iMax--;
                        }
                        selectionStart = -1;
                        int iMax22 = Math.max(i2, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0) {
                            iMin = -1;
                            if (selectionStart != -1) {
                            }
                        }
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                EmojiSpan[] emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, iMin, EmojiSpan.class);
                if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                    for (EmojiSpan emojiSpan : emojiSpanArr) {
                        int spanStart = editable.getSpanStart(emojiSpan);
                        int spanEnd = editable.getSpanEnd(emojiSpan);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    InputConnectionWrapper inputConnectionWrapper = (InputConnectionWrapper) inputConnection;
                    inputConnectionWrapper.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    inputConnectionWrapper.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m8784f(Editable editable, int i, KeyEvent keyEvent) {
        if (!(i != 67 ? i != 112 ? false : EmojiProcessor.m8799a(editable, keyEvent, true) : EmojiProcessor.m8799a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m8785g() {
        return f24279k != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final int m8786b(int i, String str) {
        Preconditions.m7699f(m8788d() == 1, "Not initialized yet");
        Preconditions.m7698e(str, "charSequence cannot be null");
        EmojiProcessor emojiProcessor = this.f24284e.f24290b;
        emojiProcessor.getClass();
        if (i < 0 || i >= str.length()) {
            return -1;
        }
        if (str instanceof Spanned) {
            Spanned spanned = (Spanned) str;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i, i + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanEnd(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessor.EmojiProcessLookupCallback) emojiProcessor.m8801c(str, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new EmojiProcessor.EmojiProcessLookupCallback(i))).f24309c;
    }

    /* JADX INFO: renamed from: c */
    public final int m8787c(CharSequence charSequence, int i) {
        Preconditions.m7699f(m8788d() == 1, "Not initialized yet");
        Preconditions.m7698e(charSequence, "charSequence cannot be null");
        EmojiProcessor emojiProcessor = this.f24284e.f24290b;
        emojiProcessor.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i, i + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanStart(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessor.EmojiProcessLookupCallback) emojiProcessor.m8801c(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new EmojiProcessor.EmojiProcessLookupCallback(i))).f24308b;
    }

    /* JADX INFO: renamed from: d */
    public final int m8788d() {
        this.f24280a.readLock().lock();
        try {
            return this.f24282c;
        } finally {
            this.f24280a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m8789h() {
        Preconditions.m7699f(this.f24287h == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m8788d() == 1) {
            return;
        }
        this.f24280a.writeLock().lock();
        try {
            if (this.f24282c == 0) {
                return;
            }
            this.f24282c = 0;
            this.f24280a.writeLock().unlock();
            CompatInternal19 compatInternal19 = this.f24284e;
            EmojiCompat emojiCompat = compatInternal19.f24289a;
            try {
                emojiCompat.f24285f.mo8796a(compatInternal19.new C16331());
            } catch (Throwable th) {
                emojiCompat.m8790i(th);
            }
        } finally {
            this.f24280a.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m8790i(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f24280a.writeLock().lock();
        try {
            this.f24282c = 2;
            arrayList.addAll(this.f24281b);
            this.f24281b.clear();
            this.f24280a.writeLock().unlock();
            this.f24283d.post(new ListenerDispatcher(arrayList, this.f24282c, th));
        } catch (Throwable th2) {
            this.f24280a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0098 A[Catch: all -> 0x008b, TRY_ENTER, TryCatch #1 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:92:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8 A[Catch: all -> 0x008b, TryCatch #1 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:92:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #2 {all -> 0x00fc, blocks: (B:62:0x00ca, B:65:0x00d2, B:47:0x008e), top: B:94:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence m8791j(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i4;
        int i5;
        EmojiSpan[] emojiSpanArr;
        Preconditions.m7699f(m8788d() == 1, "Not initialized yet");
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        Preconditions.m7695b(i <= i2, "start should be <= than end");
        UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable = null;
        if (charSequence == null) {
            return null;
        }
        Preconditions.m7695b(i <= charSequence.length(), "start should be < than charSequence length");
        Preconditions.m7695b(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z2 = i3 == 1;
        EmojiProcessor emojiProcessor = this.f24284e.f24290b;
        emojiProcessor.getClass();
        boolean z3 = charSequence instanceof SpannableBuilder;
        if (z3) {
            ((SpannableBuilder) charSequence).m8810a();
        }
        if (z3) {
            unprecomputeTextOnModificationSpannable = new UnprecomputeTextOnModificationSpannable((Spannable) charSequence);
            if (unprecomputeTextOnModificationSpannable != null) {
            }
            i4 = i;
            i5 = i2;
            if (i4 == i5) {
            }
            ((SpannableBuilder) charSequence2).m8811b();
            return charSequence2;
        }
        try {
            if (!(charSequence instanceof Spannable)) {
                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, EmojiSpan.class) <= i2) {
                    unprecomputeTextOnModificationSpannable = new UnprecomputeTextOnModificationSpannable();
                    unprecomputeTextOnModificationSpannable.f24347a = false;
                    unprecomputeTextOnModificationSpannable.f24348b = new SpannableString(charSequence);
                }
                if (unprecomputeTextOnModificationSpannable != null) {
                    while (i < r3) {
                    }
                }
                i4 = i;
                i5 = i2;
                if (i4 == i5) {
                    charSequence2 = charSequence;
                    if (!z3) {
                    }
                }
                ((SpannableBuilder) charSequence2).m8811b();
                return charSequence2;
            }
            try {
                unprecomputeTextOnModificationSpannable = new UnprecomputeTextOnModificationSpannable((Spannable) charSequence);
                if (unprecomputeTextOnModificationSpannable != null && (emojiSpanArr = (EmojiSpan[]) unprecomputeTextOnModificationSpannable.f24348b.getSpans(i, i2, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
                    for (EmojiSpan emojiSpan : emojiSpanArr) {
                        int spanStart = unprecomputeTextOnModificationSpannable.f24348b.getSpanStart(emojiSpan);
                        int spanEnd = unprecomputeTextOnModificationSpannable.f24348b.getSpanEnd(emojiSpan);
                        if (spanStart != i2) {
                            unprecomputeTextOnModificationSpannable.removeSpan(emojiSpan);
                        }
                        i = Math.min(spanStart, i);
                        i2 = Math.max(spanEnd, i2);
                    }
                }
                i4 = i;
                i5 = i2;
                if (i4 == i5 || i4 >= charSequence.length()) {
                    charSequence2 = charSequence;
                    if (!z3) {
                        return charSequence2;
                    }
                } else {
                    charSequence2 = charSequence;
                    try {
                        UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable2 = (UnprecomputeTextOnModificationSpannable) emojiProcessor.m8801c(charSequence2, i4, i5, Integer.MAX_VALUE, z2, new EmojiProcessor.EmojiProcessAddSpanCallback(unprecomputeTextOnModificationSpannable, emojiProcessor.f24302a));
                        if (unprecomputeTextOnModificationSpannable2 != null) {
                            Spannable spannable = unprecomputeTextOnModificationSpannable2.f24348b;
                            if (z3) {
                                ((SpannableBuilder) charSequence2).m8811b();
                            }
                            return spannable;
                        }
                        if (!z3) {
                            return charSequence2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        if (!z3) {
                        }
                    }
                }
                ((SpannableBuilder) charSequence2).m8811b();
                return charSequence2;
            } catch (Throwable th3) {
                th = th3;
                charSequence2 = charSequence;
                th = th;
                if (!z3) {
                }
            }
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z3) {
            throw th;
        }
        ((SpannableBuilder) charSequence2).m8811b();
        throw th;
    }

    /* JADX INFO: renamed from: k */
    public final void m8792k(InitCallback initCallback) {
        Preconditions.m7698e(initCallback, "initCallback cannot be null");
        this.f24280a.writeLock().lock();
        try {
            if (this.f24282c == 1 || this.f24282c == 2) {
                this.f24283d.post(new ListenerDispatcher(Arrays.asList(initCallback), this.f24282c, null));
            } else {
                this.f24281b.add(initCallback);
            }
            this.f24280a.writeLock().unlock();
        } catch (Throwable th) {
            this.f24280a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8793l(EditorInfo editorInfo) {
        if (m8788d() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        CompatInternal19 compatInternal19 = this.f24284e;
        compatInternal19.getClass();
        Bundle bundle = editorInfo.extras;
        MetadataList metadataList = compatInternal19.f24291c.f24332a;
        int iM8830a = metadataList.m8830a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM8830a != 0 ? metadataList.f24373b.getInt(iM8830a + metadataList.f24372a) : 0);
        Bundle bundle2 = editorInfo.extras;
        compatInternal19.f24289a.getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class InitCallback {
        /* JADX INFO: renamed from: a */
        public void mo695a() {
        }

        /* JADX INFO: renamed from: b */
        public void mo696b() {
        }
    }
}
