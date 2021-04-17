public class main {

    public static abstract class Counter {
        private int count = 0;
        private int increment;

        public Counter(int increment) {
            this.increment = increment;
        }

        public int getAndIncrement() {
            this.count += this.increment;
            return this.count;
        }

        //public abstract String getNewDocumentName();
    }

    public static class DocumentNameCreator extends Object {
        public String prefix;

        public DocumentNameCreator(String prefix, Counter counter) {
            this.prefix = prefix;

        }

        public DocumentNameCreator(int increment, String prefix) {

            this.prefix = prefix;
        }

        public String getNewDocumentName(Counter counter) {
            return prefix ;
        }
    }
}
