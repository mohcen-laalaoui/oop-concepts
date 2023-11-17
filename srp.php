<?php
class Library
{
    public $name;
    public $author;
    public function __construct($name, $author)
    {
        $this->name = $name;
        $this->author = $author;
    }
    public function getName()
    {
        return $this->name;
    }
    public function getAuthor()
    {
        return $this->author;
    }
}
class LibraryCatalog
{
    public $books = [];

    public function add_book($book)
    {
        $this->books[] = $book;
    }
    public function search_book($keyword)
    {
        $results = [];
        foreach ($this->books as $book) {
            if (stripos($book->name, $keyword) !== false || stripos($book->author, $keyword) !== false) {
                $results[] = $book;
            }
        }
        return $results;
    }
}
class LibraryStatistics
{
    public function display_statistic(array $books)
    {
        echo "Total books: " . count($books) . "\n";
    }
}

$b1 = new Library("book1", "author1");
$b2 = new Library("book2", "author2");
$catalog = new LibraryCatalog();
$catalog->add_book($b1);
$catalog->add_book($b2);
$stat = new LibraryStatistics();
$stat->display_statistic($catalog->search_book($keyword));
