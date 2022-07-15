package uz.al.blog_comment.blog_comment.kafka;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerService {
    private static final String TOPIC = "blog_comment";
    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerService.class);

    public void sendMessage(String message) {
        LOGGER.info(String.format("Message send -> %s", message));
        this.kafkaTemplate.send(TOPIC, message);
    }
}
