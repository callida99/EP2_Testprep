public class TreeNode {
    private Song song;
    private TreeNode left, right;

    public TreeNode(Song newSong) {
        song = newSong;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void addRecursive(Song newSong){

        if(newSong.getTitel().compareTo(song.getTitel())<=0){//if newSong bigger than a song
            if(left!=null){
                left.addRecursive(newSong);
            }
            else{
                left = new TreeNode(newSong);
            }
        }
        else if (newSong.getTitel().compareTo(song.getTitel())>=0){ //if newSong smaller than a song
            if(right!=null){
                right.addRecursive(newSong);
            }
            else {
                right = new TreeNode(newSong);
            }
        }

    }
    public void traverseLR(TreeNode node) { //give out a tree in an alphabetical order
        if(node!=null) {

            traverseLR(node.getLeft());
            System.out.println(  node.getSong().getTitel());
            traverseLR(node.getRight());
        }
    }

    public Song lookupTitleRec(String title){
        if(song.getTitel().equals(title)){ //if the song is found
            return song;
        }

        if(left == null && right == null){ //if we have reached the end
            return  null;
        }

        return song.getTitel().compareTo(title)>=0 ? left.lookupTitleRec(title):right.lookupTitleRec(title) ; //if nothing is found continue searching
    }

    public long getLaengeRec(TreeNode node){
        if(node == null) {
            return 0;
        }
        long sum = node.getSong().getLaenge() +getLaengeRec(node.left) + getLaengeRec(node.right); //get the length of a right and of a left node

        return sum;

    }



}
