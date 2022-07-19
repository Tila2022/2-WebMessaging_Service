import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MessageController {
    MessageRepo messageRepo;
    @PostMapping("/messages")
    public String add(@RequestParam String text, @RequestParam String tag, @NotNull Map<String,Object> model) {
        Message message = new Message(text, tag);
        messageRepo.save(message);
        Iterable<Message> messages = messageRepo.findAll();
        model.put("messages",messages);
        return "main";

    }
    @PostMapping("/filter")
    public String filter(@RequestParam String filter, Map<String,Object> model) {
        Iterable<Message> messages;
        if (filter != null && !filter.isEmpty()) {
            messages = messageRepo.findByTag(filter);
        } else {
            messages = messageRepo.findAll();
        }
        model.put("messages",messages);
        return "main";
    }
}