package uz.al.blog_comment.blog_comment.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(topics = "blog", groupId = "0")
    public void consume(String message) {
        LOGGER.info(String.format("Message received -> %s", message));
    }
}
