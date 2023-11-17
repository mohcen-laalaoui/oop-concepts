<?php
class Square
{
    protected $color = "black";
    public function __construct($color)
    {
        $this->color = $color;
    }
    public function get_color($color = "black")
    {
        $this->color = $color;
    }
    public function get_area($length){
        return pow($this->$length,2);
    }
}
class Triangle{
    protected $color = "black";
    public function __construct($color)
    {
        $this->color = $color;
    }
    public function get_color($color = "black")
    {
        $this->color = $color;
    }
    public function get_area($base , $height){
        return (0.5 * $this->$height * $this->$base);
    }
}
class Shape
{
    public $color;
    public function __construct($color = "black")
    {
        $this->color = $color;
    }
    public function get_color()
    {
        return $this->color;
    }
     public function get_area()
    {
    }
}
class Circle extends Shape{
    protected $radius;
    public function __construct($color = "black" , $radius) {
        parent::__construct($color);
        $this->radius = $radius;
    }
    public function get_area()
    {
        return pi() * pow($this->radius, 2);
    }
}
$circle = new circle("red", 5);
echo "Color of Circle is: " . $circle->get_color() . "\n";
echo "Surface of Circle is: " . $circle->get_area();
