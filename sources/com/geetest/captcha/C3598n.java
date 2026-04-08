package com.geetest.captcha;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.geetest.captcha.n */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class C3598n {
    static {
        char c2 = File.separatorChar;
        try {
            StringWriter stringWriter = new StringWriter(4);
            new PrintWriter(stringWriter).println();
            stringWriter.toString();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m14359a(Reader reader) {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[4096];
            while (true) {
                int i = reader.read(cArr);
                if (-1 == i) {
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, i);
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m14360a(byte[] bArr, String str) {
        return new String(bArr, Charset.forName(str));
    }

    /* JADX INFO: renamed from: a */
    public static void m14361a(String str, Writer writer) throws IOException {
        if (str != null) {
            writer.write(str);
        }
    }
}
