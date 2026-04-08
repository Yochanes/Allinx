package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public final class SpannableBuilder extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a */
    public final Class f24338a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f24339b;

    /* JADX INFO: compiled from: Proguard */
    public static class WatcherWrapper implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: a */
        public final Object f24340a;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f24341b = new AtomicInteger(0);

        public WatcherWrapper(Object obj) {
            this.f24340a = obj;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f24340a).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f24340a).beforeTextChanged(charSequence, i, i2, i3);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f24341b.get() <= 0 || !(obj instanceof EmojiSpan)) {
                ((SpanWatcher) this.f24340a).onSpanAdded(spannable, obj, i, i2);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[PHI: r11
          0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f24341b.get() <= 0 || !(obj instanceof EmojiSpan)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    i5 = i;
                    i6 = i3;
                } else {
                    if (i > i2) {
                        i = 0;
                    }
                    if (i3 > i4) {
                        i5 = i;
                        i6 = 0;
                    }
                }
                ((SpanWatcher) this.f24340a).onSpanChanged(spannable, obj, i5, i2, i6, i4);
            }
        }

        @Override // android.text.SpanWatcher
        public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f24341b.get() <= 0 || !(obj instanceof EmojiSpan)) {
                ((SpanWatcher) this.f24340a).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f24340a).onTextChanged(charSequence, i, i2, i3);
        }
    }

    public SpannableBuilder(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f24339b = new ArrayList();
        Preconditions.m7698e(cls, "watcherClass cannot be null");
        this.f24338a = cls;
    }

    /* JADX INFO: renamed from: a */
    public final void m8810a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f24339b;
            if (i >= arrayList.size()) {
                return;
            }
            ((WatcherWrapper) arrayList.get(i)).f24341b.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m8811b() {
        m8814e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f24339b;
            if (i >= arrayList.size()) {
                return;
            }
            ((WatcherWrapper) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final WatcherWrapper m8812c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f24339b;
            if (i >= arrayList.size()) {
                return null;
            }
            WatcherWrapper watcherWrapper = (WatcherWrapper) arrayList.get(i);
            if (watcherWrapper.f24340a == obj) {
                return watcherWrapper;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8813d(Object obj) {
        if (obj != null) {
            return this.f24338a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m8814e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f24339b;
            if (i >= arrayList.size()) {
                return;
            }
            ((WatcherWrapper) arrayList.get(i)).f24341b.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        WatcherWrapper watcherWrapperM8812c;
        if (m8813d(obj) && (watcherWrapperM8812c = m8812c(obj)) != null) {
            obj = watcherWrapperM8812c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        WatcherWrapper watcherWrapperM8812c;
        if (m8813d(obj) && (watcherWrapperM8812c = m8812c(obj)) != null) {
            obj = watcherWrapperM8812c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        WatcherWrapper watcherWrapperM8812c;
        if (m8813d(obj) && (watcherWrapperM8812c = m8812c(obj)) != null) {
            obj = watcherWrapperM8812c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f24338a != cls) {
            return super.getSpans(i, i2, cls);
        }
        WatcherWrapper[] watcherWrapperArr = (WatcherWrapper[]) super.getSpans(i, i2, WatcherWrapper.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, watcherWrapperArr.length);
        for (int i3 = 0; i3 < watcherWrapperArr.length; i3++) {
            objArr[i3] = watcherWrapperArr[i3].f24340a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.f24338a == cls) {
            cls = WatcherWrapper.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        WatcherWrapper watcherWrapperM8812c;
        if (m8813d(obj)) {
            watcherWrapperM8812c = m8812c(obj);
            if (watcherWrapperM8812c != null) {
                obj = watcherWrapperM8812c;
            }
        } else {
            watcherWrapperM8812c = null;
        }
        super.removeSpan(obj);
        if (watcherWrapperM8812c != null) {
            this.f24339b.remove(watcherWrapperM8812c);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m8813d(obj)) {
            WatcherWrapper watcherWrapper = new WatcherWrapper(obj);
            this.f24339b.add(watcherWrapper);
            obj = watcherWrapper;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new SpannableBuilder(this.f24338a, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m8810a();
        super.replace(i, i2, charSequence);
        m8814e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public SpannableBuilder(Class cls, SpannableBuilder spannableBuilder, int i, int i2) {
        super(spannableBuilder, i, i2);
        this.f24339b = new ArrayList();
        Preconditions.m7698e(cls, "watcherClass cannot be null");
        this.f24338a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m8810a();
        super.replace(i, i2, charSequence, i3, i4);
        m8814e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
