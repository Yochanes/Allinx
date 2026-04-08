package io.intercom.android.sdk.models;

import io.intercom.android.sdk.blocks.lib.models.Author;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_Card extends Card {
    private final Author author;
    private final String description;
    private final String text;
    private final String title;
    private final String type;

    public AutoValue_Card(String str, String str2, String str3, String str4, Author author) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.type = str;
        if (str2 == null) {
            throw new NullPointerException("Null text");
        }
        this.text = str2;
        if (str3 == null) {
            throw new NullPointerException("Null title");
        }
        this.title = str3;
        if (str4 == null) {
            throw new NullPointerException("Null description");
        }
        this.description = str4;
        if (author == null) {
            throw new NullPointerException("Null author");
        }
        this.author = author;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Card) {
            Card card = (Card) obj;
            if (this.type.equals(card.getType()) && this.text.equals(card.getText()) && this.title.equals(card.getTitle()) && this.description.equals(card.getDescription()) && this.author.equals(card.getAuthor())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Card
    public Author getAuthor() {
        return this.author;
    }

    @Override // io.intercom.android.sdk.models.Card
    public String getDescription() {
        return this.description;
    }

    @Override // io.intercom.android.sdk.models.Card
    public String getText() {
        return this.text;
    }

    @Override // io.intercom.android.sdk.models.Card
    public String getTitle() {
        return this.title;
    }

    @Override // io.intercom.android.sdk.models.Card
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((((((this.type.hashCode() ^ 1000003) * 1000003) ^ this.text.hashCode()) * 1000003) ^ this.title.hashCode()) * 1000003) ^ this.description.hashCode()) * 1000003) ^ this.author.hashCode();
    }

    public String toString() {
        return "Card{type=" + this.type + ", text=" + this.text + ", title=" + this.title + ", description=" + this.description + ", author=" + this.author + "}";
    }
}
