package co.paulfran.paulfranco.tourguideapp;

public class Location {

        // Tittle of the Location
        private int mTittleItem;

        // Text of the Location
        private int mTextItem;

        // Drawable resource ID
        private int mImageResourceId;

        /*
         * Create a new Venue object.
         * @param Tittle is the name of the Location
         * @param Text is the corresponding text of the Location
         * @param image is drawable reference ID that corresponds to the Location
         * */
        public Location(int Tittle, int Text, int imageResourceId) {
            mTittleItem = Tittle;
            mTextItem = Text;
            mImageResourceId = imageResourceId;
        }

        /**
         * Get the tittle of the Location
         */
        public int getLocationTittle() {
            return mTittleItem;
        }

        /**
         * Get the text of the Location
         */
        public int getLocationText() {
            return mTextItem;
        }

        /**
         * Get the image resource ID
         */
        public int getImageResourceId() {
            return mImageResourceId;
        }
}
