package com.squareup.moshi;

import java.io.Closeable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class JsonReader implements Closeable {

    /* JADX INFO: renamed from: a */
    public int f43383a;

    /* JADX INFO: renamed from: com.squareup.moshi.JsonReader$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C50211 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f43384a;

        static {
            int[] iArr = new int[Token.values().length];
            f43384a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43384a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43384a[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43384a[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43384a[7] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43384a[8] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Options {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Token {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Token[] f43385a = {new Token("BEGIN_ARRAY", 0), new Token("END_ARRAY", 1), new Token("BEGIN_OBJECT", 2), new Token("END_OBJECT", 3), new Token("NAME", 4), new Token("STRING", 5), new Token("NUMBER", 6), new Token("BOOLEAN", 7), new Token("NULL", 8), new Token("END_DOCUMENT", 9)};

        /* JADX INFO: Fake field, exist only in values array */
        Token EF5;

        public static Token valueOf(String str) {
            return (Token) Enum.valueOf(Token.class, str);
        }

        public static Token[] values() {
            return (Token[]) f43385a.clone();
        }
    }
}
