<?php
interface logger
{
    public function handl($message);
}
class user_controller
{
    public $logger;
    public function __construct(logger $logger)
    {
        $this->logger = $logger;
    }
    public function update_profile($data)
    {
        $this->logger->handl($data);
    }
}
class file_logger implements logger
{
    public function handl($message)
    {
        echo "Log to the file";
    }
}
class dataBase_logger implements logger{
    public function handl($message){
        echo "Log to the DB";
    }
}
$s = new file_logger();
$u = new user_controller($s);
$u->update_profile($s);

?>