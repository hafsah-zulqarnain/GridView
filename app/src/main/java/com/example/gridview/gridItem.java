package com.example.gridview;

public class gridItem {
        private int imageResId;
        private String text;

        public gridItem(int imageResId, String text) {
            this.imageResId = imageResId;
            this.text = text;
        }

        public int getImageResId() {
            return imageResId;
        }

        public String getText() {
            return text;
        }

}
