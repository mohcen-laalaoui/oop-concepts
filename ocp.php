<?php
interface Shapee
{
    public function getArea();
}


class Square implements Shapee
{
    public $length;

    public function __construct($length)
    {
        $this->length = $length;
    }

    public function getArea()
    {
        return $this->length * $this->length;
    }
}

class circle implements Shapee
{
    public $ra;
    public function __construct($ra)
    {
        $this->ra = $ra;
    }
    public function getArea()
    {
        return pi() * pow($this->ra, 2);
    }
}

class AreaCalculate
{
    public function calculate(...$shapes)
    {
        $area = [];
        foreach ($shapes as $shapee) {
            $area[] = $shapee->getArea();
        }
        return array_sum($area);
    }
}

$ac = new AreaCalculate();
echo $ac->calculate(new Square(3), new Square(6));
echo "\n";
echo $ac->calculate(new circle(5), new circle(8));