package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public class Joiner {
    private final String separator;

    /* JADX INFO: renamed from: com.google.common.base.Joiner$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C41071 extends Joiner {
        final /* synthetic */ Joiner this$0;
        final /* synthetic */ String val$nullText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41071(Joiner joiner, Joiner joiner2, String str) {
            super(joiner2, null);
            this.val$nullText = str;
            this.this$0 = joiner;
        }

        @Override // com.google.common.base.Joiner
        public Joiner skipNulls() {
            throw new UnsupportedOperationException("already specified useForNull");
        }

        @Override // com.google.common.base.Joiner
        public CharSequence toString(@CheckForNull Object obj) {
            return obj == null ? this.val$nullText : this.this$0.toString(obj);
        }

        @Override // com.google.common.base.Joiner
        public Joiner useForNull(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.Joiner$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C41082 extends Joiner {
        public C41082(Joiner joiner) {
            super(joiner, null);
        }

        @Override // com.google.common.base.Joiner
        public <A extends Appendable> A appendTo(A a2, Iterator<? extends Object> it) throws IOException {
            Preconditions.checkNotNull(a2, "appendable");
            Preconditions.checkNotNull(it, "parts");
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null) {
                    a2.append(Joiner.this.toString(next));
                    break;
                }
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 != null) {
                    a2.append(Joiner.access$100(Joiner.this));
                    a2.append(Joiner.this.toString(next2));
                }
            }
            return a2;
        }

        @Override // com.google.common.base.Joiner
        public Joiner useForNull(String str) {
            throw new UnsupportedOperationException("already specified skipNulls");
        }

        @Override // com.google.common.base.Joiner
        public MapJoiner withKeyValueSeparator(String str) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.Joiner$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C41093 extends AbstractList<Object> {
        final /* synthetic */ Object val$first;
        final /* synthetic */ Object[] val$rest;
        final /* synthetic */ Object val$second;

        public C41093(Object[] objArr, Object obj, Object obj2) {
            this.val$rest = objArr;
            this.val$first = obj;
            this.val$second = obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        @CheckForNull
        public Object get(int i) {
            return i != 0 ? i != 1 ? this.val$rest[i - 2] : this.val$second : this.val$first;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.val$rest.length + 2;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MapJoiner {
        private final Joiner joiner;
        private final String keyValueSeparator;

        public /* synthetic */ MapJoiner(Joiner joiner, String str, C41071 c41071) {
            this(joiner, str);
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a2, Map<?, ?> map) {
            return (A) appendTo(a2, map.entrySet());
        }

        public String join(Map<?, ?> map) {
            return join(map.entrySet());
        }

        public MapJoiner useForNull(String str) {
            return new MapJoiner(this.joiner.useForNull(str), this.keyValueSeparator);
        }

        private MapJoiner(Joiner joiner, String str) {
            this.joiner = joiner;
            this.keyValueSeparator = (String) Preconditions.checkNotNull(str);
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb, Map<?, ?> map) {
            return appendTo(sb, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        public String join(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return join(iterable.iterator());
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a2, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return (A) appendTo(a2, iterable.iterator());
        }

        public String join(Iterator<? extends Map.Entry<?, ?>> it) {
            return appendTo(new StringBuilder(), it).toString();
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a2, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
            Preconditions.checkNotNull(a2);
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                a2.append(this.joiner.toString(next.getKey()));
                a2.append(this.keyValueSeparator);
                a2.append(this.joiner.toString(next.getValue()));
                while (it.hasNext()) {
                    a2.append(Joiner.access$100(this.joiner));
                    Map.Entry<?, ?> next2 = it.next();
                    a2.append(this.joiner.toString(next2.getKey()));
                    a2.append(this.keyValueSeparator);
                    a2.append(this.joiner.toString(next2.getValue()));
                }
            }
            return a2;
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return appendTo(sb, iterable.iterator());
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                appendTo(sb, it);
                return sb;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    public /* synthetic */ Joiner(Joiner joiner, C41071 c41071) {
        this(joiner);
    }

    public static /* synthetic */ String access$100(Joiner joiner) {
        return joiner.separator;
    }

    private static Iterable<Object> iterable(@CheckForNull Object obj, @CheckForNull Object obj2, Object[] objArr) {
        Preconditions.checkNotNull(objArr);
        return new C41093(objArr, obj, obj2);
    }

    /* JADX INFO: renamed from: on */
    public static Joiner m14761on(String str) {
        return new Joiner(str);
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a2, Iterable<? extends Object> iterable) {
        return (A) appendTo(a2, iterable.iterator());
    }

    public final String join(Iterable<? extends Object> iterable) {
        return join(iterable.iterator());
    }

    public Joiner skipNulls() {
        return new C41082(this);
    }

    public CharSequence toString(@CheckForNull Object obj) {
        java.util.Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public Joiner useForNull(String str) {
        Preconditions.checkNotNull(str);
        return new C41071(this, this, str);
    }

    public MapJoiner withKeyValueSeparator(char c2) {
        return withKeyValueSeparator(String.valueOf(c2));
    }

    private Joiner(String str) {
        this.separator = (String) Preconditions.checkNotNull(str);
    }

    /* JADX INFO: renamed from: on */
    public static Joiner m14760on(char c2) {
        return new Joiner(String.valueOf(c2));
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a2, Iterator<? extends Object> it) throws IOException {
        Preconditions.checkNotNull(a2);
        if (it.hasNext()) {
            a2.append(toString(it.next()));
            while (it.hasNext()) {
                a2.append(this.separator);
                a2.append(toString(it.next()));
            }
        }
        return a2;
    }

    public final String join(Iterator<? extends Object> it) {
        return appendTo(new StringBuilder(), it).toString();
    }

    public MapJoiner withKeyValueSeparator(String str) {
        return new MapJoiner(this, str, null);
    }

    public final String join(Object[] objArr) {
        return join(Arrays.asList(objArr));
    }

    private Joiner(Joiner joiner) {
        this.separator = joiner.separator;
    }

    public final String join(@CheckForNull Object obj, @CheckForNull Object obj2, Object... objArr) {
        return join(iterable(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a2, Object[] objArr) {
        return (A) appendTo(a2, Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a2, @CheckForNull Object obj, @CheckForNull Object obj2, Object... objArr) {
        return (A) appendTo(a2, iterable(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, Iterable<? extends Object> iterable) {
        return appendTo(sb, iterable.iterator());
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, Iterator<? extends Object> it) {
        try {
            appendTo(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, Object[] objArr) {
        return appendTo(sb, (Iterable<? extends Object>) Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, @CheckForNull Object obj, @CheckForNull Object obj2, Object... objArr) {
        return appendTo(sb, iterable(obj, obj2, objArr));
    }
}
