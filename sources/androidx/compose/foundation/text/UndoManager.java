package androidx.compose.foundation.text;

import androidx.compose.p013ui.text.input.TextFieldValue;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/text/UndoManager;", "", "Entry", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class UndoManager {

    /* JADX INFO: renamed from: a */
    public Entry f8748a;

    /* JADX INFO: renamed from: b */
    public Entry f8749b;

    /* JADX INFO: renamed from: c */
    public int f8750c;

    /* JADX INFO: renamed from: d */
    public Long f8751d;

    /* JADX INFO: renamed from: e */
    public boolean f8752e;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/UndoManager$Entry;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Entry {

        /* JADX INFO: renamed from: a */
        public Entry f8753a;

        /* JADX INFO: renamed from: b */
        public TextFieldValue f8754b;

        public Entry(Entry entry, TextFieldValue textFieldValue) {
            this.f8753a = entry;
            this.f8754b = textFieldValue;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3271a(TextFieldValue textFieldValue) {
        Entry entry;
        TextFieldValue textFieldValue2;
        this.f8752e = false;
        Entry entry2 = this.f8748a;
        if (Intrinsics.m18594b(textFieldValue, entry2 != null ? entry2.f8754b : null)) {
            return;
        }
        String str = textFieldValue.f20403a.f19890b;
        Entry entry3 = this.f8748a;
        if (Intrinsics.m18594b(str, (entry3 == null || (textFieldValue2 = entry3.f8754b) == null) ? null : textFieldValue2.f20403a.f19890b)) {
            Entry entry4 = this.f8748a;
            if (entry4 == null) {
                return;
            }
            entry4.f8754b = textFieldValue;
            return;
        }
        this.f8748a = new Entry(this.f8748a, textFieldValue);
        this.f8749b = null;
        int length = textFieldValue.f20403a.f19890b.length() + this.f8750c;
        this.f8750c = length;
        if (length > 100000) {
            Entry entry5 = this.f8748a;
            if ((entry5 != null ? entry5.f8753a : null) == null) {
                return;
            }
            while (true) {
                if (entry5 == null) {
                    entry = null;
                } else {
                    Entry entry6 = entry5.f8753a;
                    if (entry6 != null) {
                        entry = entry6.f8753a;
                    }
                }
                if (entry == null) {
                    break;
                } else {
                    entry5 = entry5.f8753a;
                }
            }
            if (entry5 == null) {
                return;
            }
            entry5.f8753a = null;
        }
    }
}
