package io.intercom.android.sdk.utilities;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.StringRes;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Phrase {
    private static final int EOF = 0;
    private char curChar;
    private int curCharIndex;
    private CharSequence formatted;
    private Token head;
    private final Set<String> keys = new HashSet();
    private final Map<String, CharSequence> keysToValues = new HashMap();
    private final CharSequence pattern;

    /* JADX INFO: compiled from: Proguard */
    public static class KeyToken extends Token {
        private final String key;
        private CharSequence value;

        public KeyToken(Token token, String str) {
            super(token);
            this.key = str;
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        public void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
            this.value = map.get(this.key);
            int formattedStart = getFormattedStart();
            spannableStringBuilder.replace(formattedStart, this.key.length() + formattedStart + 2, this.value);
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        public int getFormattedLength() {
            return this.value.length();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LeftCurlyBracketToken extends Token {
        public LeftCurlyBracketToken(Token token) {
            super(token);
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        public void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
            int formattedStart = getFormattedStart();
            spannableStringBuilder.replace(formattedStart, formattedStart + 2, "{");
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        public int getFormattedLength() {
            return 1;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Token {
        Token next;
        private final Token prev;

        public Token(Token token) {
            this.prev = token;
            if (token != null) {
                token.next = this;
            }
        }

        public abstract void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map);

        public abstract int getFormattedLength();

        public final int getFormattedStart() {
            Token token = this.prev;
            if (token == null) {
                return 0;
            }
            return token.getFormattedStart() + this.prev.getFormattedLength();
        }
    }

    private Phrase(CharSequence charSequence) {
        this.curChar = charSequence.length() > 0 ? charSequence.charAt(0) : (char) 0;
        this.pattern = charSequence;
        Token token = null;
        while (true) {
            token = token(token);
            if (token == null) {
                return;
            }
            if (this.head == null) {
                this.head = token;
            }
        }
    }

    private void consume() {
        int i = this.curCharIndex + 1;
        this.curCharIndex = i;
        this.curChar = i == this.pattern.length() ? (char) 0 : this.pattern.charAt(this.curCharIndex);
    }

    public static Phrase from(Fragment fragment, @StringRes int i) {
        return from(fragment.getResources(), i);
    }

    private KeyToken key(Token token) {
        char c2;
        StringBuilder sb = new StringBuilder();
        consume();
        while (true) {
            c2 = this.curChar;
            if ((c2 < 'a' || c2 > 'z') && ((c2 < 'A' || c2 > 'Z') && c2 != '_' && (c2 < '0' || c2 > '9'))) {
                break;
            }
            sb.append(c2);
            consume();
        }
        if (c2 != '}') {
            throw new IllegalArgumentException("Missing closing brace: } in '" + ((Object) this.pattern) + "'");
        }
        consume();
        if (sb.length() != 0) {
            String string = sb.toString();
            this.keys.add(string);
            return new KeyToken(token, string);
        }
        throw new IllegalArgumentException("Empty key: {} in '" + ((Object) this.pattern) + "'");
    }

    private LeftCurlyBracketToken leftCurlyBracket(Token token) {
        consume();
        consume();
        return new LeftCurlyBracketToken(token);
    }

    private char lookahead() {
        if (this.curCharIndex < this.pattern.length() - 1) {
            return this.pattern.charAt(this.curCharIndex + 1);
        }
        return (char) 0;
    }

    private TextToken text(Token token) {
        int i = this.curCharIndex;
        while (true) {
            char c2 = this.curChar;
            if (c2 == '{' || c2 == 0) {
                break;
            }
            consume();
        }
        return new TextToken(token, this.curCharIndex - i);
    }

    private Token token(Token token) {
        char c2 = this.curChar;
        if (c2 == 0) {
            return null;
        }
        if (c2 != '{') {
            return text(token);
        }
        char cLookahead = lookahead();
        if (cLookahead == '{') {
            return leftCurlyBracket(token);
        }
        if (cLookahead >= 'a' && cLookahead <= 'z') {
            return key(token);
        }
        throw new IllegalArgumentException("Unexpected character '" + cLookahead + "'; expected key in '" + ((Object) this.pattern) + "'");
    }

    public CharSequence format() {
        if (this.formatted == null) {
            if (!this.keysToValues.keySet().containsAll(this.keys)) {
                HashSet hashSet = new HashSet(this.keys);
                hashSet.removeAll(this.keysToValues.keySet());
                throw new IllegalArgumentException("Missing keys: " + hashSet + " in '" + ((Object) this.pattern) + "'");
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.pattern);
            for (Token token = this.head; token != null; token = token.next) {
                token.expand(spannableStringBuilder, this.keysToValues);
            }
            this.formatted = spannableStringBuilder;
        }
        return this.formatted;
    }

    public void into(TextView textView) {
        if (textView == null) {
            throw new IllegalArgumentException("TextView must not be null.");
        }
        textView.setText(format());
    }

    public Phrase put(String str, CharSequence charSequence) {
        if (!this.keys.contains(str)) {
            StringBuilder sbM23t = AbstractC0000a.m23t("Key '", str, "' not found in '");
            sbM23t.append((Object) this.pattern);
            sbM23t.append("'");
            throw new IllegalArgumentException(sbM23t.toString());
        }
        if (charSequence != null) {
            this.keysToValues.put(str, charSequence);
            this.formatted = null;
            return this;
        }
        StringBuilder sbM23t2 = AbstractC0000a.m23t("Null value for '", str, "' in '");
        sbM23t2.append((Object) this.pattern);
        sbM23t2.append("'");
        throw new IllegalArgumentException(sbM23t2.toString());
    }

    public Phrase putOptional(String str, CharSequence charSequence) {
        return this.keys.contains(str) ? put(str, charSequence) : this;
    }

    public String toString() {
        return this.pattern.toString();
    }

    public static Phrase from(View view, @StringRes int i) {
        return from(view.getResources(), i);
    }

    public Phrase putOptional(String str, int i) {
        return this.keys.contains(str) ? put(str, i) : this;
    }

    public static Phrase from(Context context, @StringRes int i) {
        return from(context.getResources(), i);
    }

    public static Phrase from(Resources resources, @StringRes int i) {
        return from(resources.getText(i));
    }

    public static Phrase from(CharSequence charSequence) {
        return new Phrase(charSequence);
    }

    public Phrase put(String str, int i) {
        return put(str, Integer.toString(i));
    }

    /* JADX INFO: compiled from: Proguard */
    public static class TextToken extends Token {
        private final int textLength;

        public TextToken(Token token, int i) {
            super(token);
            this.textLength = i;
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        public int getFormattedLength() {
            return this.textLength;
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        public void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
        }
    }
}
