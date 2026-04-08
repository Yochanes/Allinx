package io.intercom.android.sdk.models;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.blocks.lib.models.Author;
import io.intercom.android.sdk.utilities.NullSafety;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class Card {

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        @Nullable
        String articleId;

        @Nullable
        Author.Builder author;

        @Nullable
        String description;

        @Nullable
        String linkType;

        @Nullable
        String text;

        @Nullable
        String title;

        @Nullable
        String type;

        public Card build() {
            Author.Builder builder = this.author;
            if (builder == null) {
                builder = new Author.Builder();
            }
            return Card.create(NullSafety.valueOrEmpty(this.type), NullSafety.valueOrEmpty(this.text), NullSafety.valueOrEmpty(this.title), NullSafety.valueOrEmpty(this.description), builder.build());
        }
    }

    public static Card create(String str, String str2, String str3, String str4, Author author) {
        return new AutoValue_Card(str, str2, str3, str4, author);
    }

    public abstract Author getAuthor();

    public abstract String getDescription();

    public abstract String getText();

    public abstract String getTitle();

    public abstract String getType();
}
