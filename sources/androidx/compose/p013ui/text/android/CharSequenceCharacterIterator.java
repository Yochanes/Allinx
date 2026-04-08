package androidx.compose.p013ui.text.android;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.CharacterIterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/text/android/CharSequenceCharacterIterator;", "Ljava/lang/Object;", "Ljava/text/CharacterIterator;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class CharSequenceCharacterIterator implements CharacterIterator {

    /* JADX INFO: renamed from: a */
    public final CharSequence f20124a;

    /* JADX INFO: renamed from: b */
    public final int f20125b;

    /* JADX INFO: renamed from: c */
    public int f20126c = 0;

    public CharSequenceCharacterIterator(CharSequence charSequence, int i) {
        this.f20124a = charSequence;
        this.f20125b = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f20126c;
        if (i == this.f20125b) {
            return (char) 65535;
        }
        return this.f20124a.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f20126c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f20125b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f20126c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f20125b;
        if (i == 0) {
            this.f20126c = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f20126c = i2;
        return this.f20124a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f20126c + 1;
        this.f20126c = i;
        int i2 = this.f20125b;
        if (i < i2) {
            return this.f20124a.charAt(i);
        }
        this.f20126c = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f20126c;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f20126c = i2;
        return this.f20124a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.f20125b || i < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f20126c = i;
        return current();
    }
}
