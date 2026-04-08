package androidx.compose.p013ui.text;

import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.text.LinkAnnotation;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import com.google.common.net.HttpHeaders;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "Annotation", "Builder", "Companion", "ExhaustiveAnnotation", HttpHeaders.RANGE, "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AnnotatedString implements CharSequence {

    /* JADX INFO: renamed from: a */
    public final List f19889a;

    /* JADX INFO: renamed from: b */
    public final String f19890b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f19891c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f19892d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\b\u0002\u0003\u0004\u0005\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/text/AnnotatedString$Annotation;", "", "Landroidx/compose/ui/text/AnnotatedString$ExhaustiveAnnotation;", "Landroidx/compose/ui/text/Bullet;", "Landroidx/compose/ui/text/LinkAnnotation;", "Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/StringAnnotation;", "Landroidx/compose/ui/text/TtsAnnotation;", "Landroidx/compose/ui/text/UrlAnnotation;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public interface Annotation {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/AnnotatedString$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/AnnotatedString$ExhaustiveAnnotation;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class ExhaustiveAnnotation implements Annotation {
    }

    static {
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f19984a;
    }

    public AnnotatedString(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f19889a = list;
        this.f19890b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                Range range = (Range) list.get(i);
                Object obj = range.f19900a;
                if (obj instanceof SpanStyle) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(range);
                } else if (obj instanceof ParagraphStyle) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(range);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f19891c = arrayList;
        this.f19892d = arrayList2;
        List listM18449p0 = arrayList2 != null ? CollectionsKt.m18449p0(arrayList2, new AnnotatedString$special$$inlined$sortedBy$1()) : null;
        List list2 = listM18449p0;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i2 = ((Range) CollectionsKt.m18398B(listM18449p0)).f19902c;
        MutableIntList mutableIntList = IntListKt.f3680a;
        MutableIntList mutableIntList2 = new MutableIntList(1);
        mutableIntList2.m2019c(i2);
        int size2 = listM18449p0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            Range range2 = (Range) listM18449p0.get(i3);
            while (true) {
                if (mutableIntList2.f3679b == 0) {
                    break;
                }
                int iM1989b = mutableIntList2.m1989b();
                if (range2.f19901b >= iM1989b) {
                    mutableIntList2.m2021e(mutableIntList2.f3679b - 1);
                } else {
                    int i4 = range2.f19902c;
                    if (i4 > iM1989b) {
                        InlineClassHelperKt.m6567a("Paragraph overlap not allowed, end " + i4 + " should be less than or equal to " + iM1989b);
                    }
                }
            }
            mutableIntList2.m2019c(range2.f19902c);
        }
    }

    /* JADX INFO: renamed from: a */
    public final AnnotatedString m6335a(Function1 function1) {
        Builder builder = new Builder(this);
        ArrayList arrayList = builder.f19895c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) function1.invoke(((Builder.MutableRange) arrayList.get(i)).m6349a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Range range = (Range) list.get(i2);
                Object obj = range.f19900a;
                arrayList3.add(new Builder.MutableRange(range.f19901b, range.f19903d, obj, range.f19902c));
            }
            CollectionsKt.m18434i(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        return builder.m6348j();
    }

    /* JADX INFO: renamed from: b */
    public final List m6336b(int i) {
        List list = this.f19889a;
        if (list == null) {
            return EmptyList.f51496a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            Range range = (Range) obj;
            if ((range.f19900a instanceof LinkAnnotation) && AnnotatedStringKt.m6352b(0, i, range.f19901b, range.f19902c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final AnnotatedString m6337c(Function1 function1) {
        Builder builder = new Builder(this);
        ArrayList arrayList = builder.f19895c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Range range = (Range) function1.invoke(((Builder.MutableRange) arrayList.get(i)).m6349a(Integer.MIN_VALUE));
            Object obj = range.f19900a;
            arrayList.set(i, new Builder.MutableRange(range.f19901b, range.f19903d, obj, range.f19902c));
        }
        return builder.m6348j();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f19890b.charAt(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnnotatedString m6338d(int i, int i2) {
        ArrayList arrayList;
        if (!(i <= i2)) {
            InlineClassHelperKt.m6567a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.f19890b;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        Intrinsics.m18598f(strSubstring, "substring(...)");
        AnnotatedString annotatedString = AnnotatedStringKt.f19904a;
        if (i > i2) {
            InlineClassHelperKt.m6567a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.f19889a;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Range range = (Range) list.get(i3);
                int i4 = range.f19901b;
                int i5 = range.f19902c;
                if (AnnotatedStringKt.m6352b(i, i2, i4, i5)) {
                    arrayList.add(new Range(Math.max(i, range.f19901b) - i, range.f19903d, range.f19900a, Math.min(i2, i5) - i));
                }
            }
            if (arrayList.isEmpty()) {
            }
        }
        return new AnnotatedString(arrayList, strSubstring);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        return Intrinsics.m18594b(this.f19890b, annotatedString.f19890b) && Intrinsics.m18594b(this.f19889a, annotatedString.f19889a);
    }

    public final int hashCode() {
        int iHashCode = this.f19890b.hashCode() * 31;
        List list = this.f19889a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f19890b.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ /* synthetic */ CharSequence subSequence(int i, int i2) {
        return m6338d(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f19890b;
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "BulletScope", "MutableRange", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Builder implements Appendable {

        /* JADX INFO: renamed from: a */
        public final StringBuilder f19893a;

        /* JADX INFO: renamed from: b */
        public final ArrayList f19894b;

        /* JADX INFO: renamed from: c */
        public final ArrayList f19895c;

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        public static final class BulletScope {
        }

        public Builder() {
            this.f19893a = new StringBuilder(16);
            this.f19894b = new ArrayList();
            this.f19895c = new ArrayList();
            new ArrayList();
        }

        /* JADX INFO: renamed from: a */
        public final void m6339a(SpanStyle spanStyle, int i, int i2) {
            this.f19895c.add(new MutableRange(spanStyle, i, i2, 8));
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            if (charSequence instanceof AnnotatedString) {
                m6340b((AnnotatedString) charSequence);
                return this;
            }
            this.f19893a.append(charSequence);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final void m6340b(AnnotatedString annotatedString) {
            StringBuilder sb = this.f19893a;
            int length = sb.length();
            sb.append(annotatedString.f19890b);
            List list = annotatedString.f19889a;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Range range = (Range) list.get(i);
                    ArrayList arrayList = this.f19895c;
                    Object obj = range.f19900a;
                    arrayList.add(new MutableRange(range.f19901b + length, range.f19903d, obj, range.f19902c + length));
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m6341c(String str) {
            this.f19893a.append(str);
        }

        /* JADX INFO: renamed from: d */
        public final void m6342d() {
            ArrayList arrayList = this.f19894b;
            if (arrayList.isEmpty()) {
                InlineClassHelperKt.m6569c("Nothing to pop.");
            }
            ((MutableRange) arrayList.remove(arrayList.size() - 1)).f19898c = this.f19893a.length();
        }

        /* JADX INFO: renamed from: e */
        public final void m6343e(int i) {
            ArrayList arrayList = this.f19894b;
            if (i >= arrayList.size()) {
                InlineClassHelperKt.m6569c(i + " should be less than " + arrayList.size());
            }
            while (arrayList.size() - 1 >= i) {
                m6342d();
            }
        }

        /* JADX INFO: renamed from: f */
        public final int m6344f(LinkAnnotation.Clickable clickable) {
            MutableRange mutableRange = new MutableRange(clickable, this.f19893a.length(), 0, 12);
            this.f19894b.add(mutableRange);
            this.f19895c.add(mutableRange);
            return r5.size() - 1;
        }

        /* JADX INFO: renamed from: g */
        public final void m6345g(String str) {
            MutableRange mutableRange = new MutableRange(new StringAnnotation(str), this.f19893a.length(), 0, 4);
            ArrayList arrayList = this.f19894b;
            arrayList.add(mutableRange);
            this.f19895c.add(mutableRange);
            arrayList.size();
        }

        /* JADX INFO: renamed from: h */
        public final int m6346h(ParagraphStyle paragraphStyle) {
            MutableRange mutableRange = new MutableRange(paragraphStyle, this.f19893a.length(), 0, 12);
            this.f19894b.add(mutableRange);
            this.f19895c.add(mutableRange);
            return r5.size() - 1;
        }

        /* JADX INFO: renamed from: i */
        public final int m6347i(SpanStyle spanStyle) {
            MutableRange mutableRange = new MutableRange(spanStyle, this.f19893a.length(), 0, 12);
            this.f19894b.add(mutableRange);
            this.f19895c.add(mutableRange);
            return r5.size() - 1;
        }

        /* JADX INFO: renamed from: j */
        public final AnnotatedString m6348j() {
            StringBuilder sb = this.f19893a;
            String string = sb.toString();
            ArrayList arrayList = this.f19895c;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(((MutableRange) arrayList.get(i)).m6349a(sb.length()));
            }
            return new AnnotatedString(string, arrayList2);
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) {
            boolean z2 = charSequence instanceof AnnotatedString;
            StringBuilder sb = this.f19893a;
            if (z2) {
                AnnotatedString annotatedString = (AnnotatedString) charSequence;
                int length = sb.length();
                sb.append((CharSequence) annotatedString.f19890b, i, i2);
                List listM6351a = AnnotatedStringKt.m6351a(annotatedString, i, i2, null);
                if (listM6351a != null) {
                    int size = listM6351a.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        Range range = (Range) listM6351a.get(i3);
                        ArrayList arrayList = this.f19895c;
                        Object obj = range.f19900a;
                        arrayList.add(new MutableRange(range.f19901b + length, range.f19903d, obj, range.f19902c + length));
                    }
                }
                return this;
            }
            sb.append(charSequence, i, i2);
            return this;
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "T", "", "Companion", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        @SourceDebugExtension
        public static final /* data */ class MutableRange<T> {

            /* JADX INFO: renamed from: a */
            public final Object f19896a;

            /* JADX INFO: renamed from: b */
            public final int f19897b;

            /* JADX INFO: renamed from: c */
            public int f19898c;

            /* JADX INFO: renamed from: d */
            public final String f19899d;

            /* JADX INFO: compiled from: Proguard */
            @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
            public static final class Companion {
            }

            public MutableRange(int i, String str, Object obj, int i2) {
                this.f19896a = obj;
                this.f19897b = i;
                this.f19898c = i2;
                this.f19899d = str;
            }

            /* JADX INFO: renamed from: a */
            public final Range m6349a(int i) {
                int i2 = this.f19898c;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (!(i != Integer.MIN_VALUE)) {
                    InlineClassHelperKt.m6569c("Item.end should be set first");
                }
                return new Range(this.f19897b, this.f19899d, this.f19896a, i);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) obj;
                return Intrinsics.m18594b(this.f19896a, mutableRange.f19896a) && this.f19897b == mutableRange.f19897b && this.f19898c == mutableRange.f19898c && Intrinsics.m18594b(this.f19899d, mutableRange.f19899d);
            }

            public final int hashCode() {
                Object obj = this.f19896a;
                return this.f19899d.hashCode() + AbstractC0455a.m2228c(this.f19898c, AbstractC0455a.m2228c(this.f19897b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MutableRange(item=");
                sb.append(this.f19896a);
                sb.append(", start=");
                sb.append(this.f19897b);
                sb.append(", end=");
                sb.append(this.f19898c);
                sb.append(", tag=");
                return AbstractC0455a.m2241p(sb, this.f19899d, ')');
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ MutableRange(Annotation annotation, int i, int i2, int i3) {
                String str;
                i2 = (i3 & 4) != 0 ? Integer.MIN_VALUE : i2;
                if ((i3 & 8) != 0) {
                    str = "";
                } else {
                    str = "androidx.compose.foundation.text.inlineContent";
                }
                this(i, str, annotation, i2);
            }
        }

        public Builder(AnnotatedString annotatedString) {
            this();
            m6340b(annotatedString);
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c2) {
            this.f19893a.append(c2);
            return this;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/text/AnnotatedString$Range;", "T", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Immutable
    @SourceDebugExtension
    public static final /* data */ class Range<T> {

        /* JADX INFO: renamed from: a */
        public final Object f19900a;

        /* JADX INFO: renamed from: b */
        public final int f19901b;

        /* JADX INFO: renamed from: c */
        public final int f19902c;

        /* JADX INFO: renamed from: d */
        public final String f19903d;

        public Range(int i, String str, Object obj, int i2) {
            this.f19900a = obj;
            this.f19901b = i;
            this.f19902c = i2;
            this.f19903d = str;
            if (i <= i2) {
                return;
            }
            InlineClassHelperKt.m6567a("Reversed range is not supported");
        }

        /* JADX INFO: renamed from: a */
        public static Range m6350a(Range range, ParagraphStyle paragraphStyle, int i, int i2, int i3) {
            Object obj = paragraphStyle;
            if ((i3 & 1) != 0) {
                obj = range.f19900a;
            }
            if ((i3 & 2) != 0) {
                i = range.f19901b;
            }
            if ((i3 & 4) != 0) {
                i2 = range.f19902c;
            }
            return new Range(i, range.f19903d, obj, i2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return false;
            }
            Range range = (Range) obj;
            return Intrinsics.m18594b(this.f19900a, range.f19900a) && this.f19901b == range.f19901b && this.f19902c == range.f19902c && Intrinsics.m18594b(this.f19903d, range.f19903d);
        }

        public final int hashCode() {
            Object obj = this.f19900a;
            return this.f19903d.hashCode() + AbstractC0455a.m2228c(this.f19902c, AbstractC0455a.m2228c(this.f19901b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Range(item=");
            sb.append(this.f19900a);
            sb.append(", start=");
            sb.append(this.f19901b);
            sb.append(", end=");
            sb.append(this.f19902c);
            sb.append(", tag=");
            return AbstractC0455a.m2241p(sb, this.f19903d, ')');
        }

        public Range(int i, int i2, Object obj) {
            this(i, "", obj, i2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnnotatedString(int i, String str, ArrayList arrayList) {
        List list = (i & 2) != 0 ? EmptyList.f51496a : arrayList;
        AnnotatedString annotatedString = AnnotatedStringKt.f19904a;
        this(list.isEmpty() ? null : list, str);
    }

    public /* synthetic */ AnnotatedString(String str) {
        this(str, EmptyList.f51496a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnnotatedString(String str, List list) {
        List list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }
}
